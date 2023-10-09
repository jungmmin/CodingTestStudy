package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.*;

public class P8_수열추측하기 {
    static int[] ch, combiArray, answer;
    static int[][] dy = new int[35][35];
    static int n, f;
    static boolean flag = false;

    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());

        ch = new int[n+1];
        answer = new int[n];
        combiArray = new int[n];
        for (int i = 0; i < n; i++) {
            combiArray[i] = combi(n-1, i);
        }

        DFS(0, 0);


    }

    public static int combi(int n, int r) {
        if (dy[n][r] != 0) {
            return dy[n][r];
        }
        if (r == 0 || n == r) {
            return 1;
        }else{
            return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
        }
    }

    public static void DFS(int l, int sum){
        if(flag){
            return;
        }
        if(l == n){
            if(sum == f){
                for (int i = 0; i < answer.length; i++) {
                    System.out.print(answer[i] + " ");
                }
                flag = true;
            }
        }else{
            for (int i = 1; i < ch.length; i++) {
                if(ch[i] == 0){
                    ch[i] = 1;
                    answer[l] = i;
                    DFS(l+1, sum + combiArray[l] * i);
                    ch[i] = 0;
                }
            }
        }
    }
}
