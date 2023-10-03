package 코딩테스트대비.Section7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.*;

public class P4_피보나치재귀_메모이제이션 {
    public static void main(String args[]) {

        int n = 45;
        int[] fibo = new int[n+1];
        DFS(n, fibo);
        for (int i = 1; i < fibo.length; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    public static int DFS(int n, int[] fibo) {
        if (fibo[n] > 0) {
            return fibo[n];
        }
        if (n == 1 || n == 2) {
            return fibo[n] = 1;
        }else{
            return fibo[n] = DFS(n - 2, fibo) + DFS(n - 1, fibo);
        }
    }
}
