package 코딩테스트대비.Section7_Recursive_Tree_Graph_DFS_BFS_기초;

/**
 * 최단 경로 같은 경우는 BFS로 하는것이 맞음
 */
public class P9_Tree_말단노드까지의가장짧은경로_DFS {
    public static void main(String args[]) {

        Node tree = new Node(1);
        tree.lt = new Node(2);
        tree.rt = new Node(3);
        tree.lt.lt = new Node(4);


        System.out.println(DFS(0, tree));
    }

    public static int DFS(int level, Node root) {
        if(root == null || root.lt == null && root.rt == null){
            return level;
        }else{
            level++;
            return Math.min(DFS(level, root.lt), DFS(level, root.rt));
        }
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
