package 코딩테스트대비.Section7_Recursive_Tree_Graph_DFS_BFS_기초;
import java.util.*;
class Node{
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
public class P5_이진트리순회_깊이우선탐색_DFS {
    public static void main(String args[]) {
        Node root;

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        DFS(root);


    }
    public static void DFS(Node root){
        if (root == null) {
            return;
        }else{
            // 전위 순회
            System.out.print(root.data + " ");
            DFS(root.lt);
            // 중위 순회
//            System.out.print(root.data + " ");
            DFS(root.rt);
            // 후위 순회
//            System.out.print(root.data + " ");
        }
    }
}
