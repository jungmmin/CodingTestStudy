package 코딩테스트대비.Section7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 최단 경로 같은 경우는 BFS로 하는것이 맞음
 */
public class P10_Tree_말단노드까지의가장짧은경로_BFS {
    public static void main(String args[]) {

        Node tree = new Node(1);
        tree.lt = new Node(2);
        tree.rt = new Node(3);
        tree.lt.lt = new Node(4);
        tree.lt.rt = new Node(5);

        System.out.println(BFS(tree));
    }

    public static int BFS(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        int level = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                if (cur.lt == null && cur.rt == null) {
                    return level;
                }
                if (cur.lt != null) {
                    q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    q.offer(cur.rt);
                }
            }
            level++;
        }
        return -1;
    }

    static class Node{
        int data;
        Node lt, rt;

        public Node(int val) {
            this.data = val;
            lt = rt = null;
        }
    }
}
