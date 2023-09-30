package 코딩테스트대비.Section7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.*;

public class P2_이진수출력_재귀 {
    public static void main(String args[]) {
        DFS(11);

    }

    public static void DFS(int n) {
        StringBuilder sb = new StringBuilder();

        if(n == 0){
            return;
        }else{
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }
}
