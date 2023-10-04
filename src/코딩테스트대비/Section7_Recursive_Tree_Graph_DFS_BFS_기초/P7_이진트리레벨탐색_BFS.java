package 코딩테스트대비.Section7_Recursive_Tree_Graph_DFS_BFS_기초;


import java.util.LinkedList;
import java.util.Queue;

public class P7_이진트리레벨탐색_BFS {
    public static void main(String args[]) {

        Node tree = new Node(1);
        tree.lt = new Node(2);
        tree.rt = new Node(3);
        tree.lt.lt = new Node(4);
        tree.lt.rt = new Node(5);
        tree.rt.lt = new Node(6);
        tree.rt.rt = new Node(7);

        BFS(tree);
    }

    public static void BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) {
                    q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    q.offer(cur.rt);
                }
            }
        }
    }
    static class Node{
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }
}
