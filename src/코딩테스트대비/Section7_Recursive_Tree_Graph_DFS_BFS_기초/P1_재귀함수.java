package 코딩테스트대비.Section7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.*;

public class P1_재귀함수 {
    public static void main(String args[]) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DFS(5);

    }
    public static void DFS(int n){
        System.out.println(n);
        if(n > 0){
            DFS(n-1);
        }
    }
}
