package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.*;

public class P2_바둑이승차 {
    static int answer = 0,c, n;


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        DFS(0, 0, array);
        System.out.println(answer);
    }
    static void DFS(int l, int sum, int[] array){
        if(sum > c){
            return;
        }
        if(l == n){
            answer = Math.max(answer, sum);
        }else{
            DFS(l+1, sum + array[l], array);
            DFS(l+1, sum, array);
        }
    }
}
