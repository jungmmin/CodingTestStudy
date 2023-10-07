package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.*;

public class P3_최대점수구하기 {
    static int n, m, answer = 0;

    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] array = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }
        DFS(0, 0, 0, array);
        System.out.println(answer);
    }
    public static void DFS(int l, int pointSum, int timeSum, int[][] array){
        if(timeSum > m){
            return;
        }
        if (l == n) {
            answer = Math.max(pointSum, answer);
        }else{
            DFS(l+1, pointSum + array[l][0], timeSum + array[l][1], array);
            DFS(l+1, pointSum, timeSum, array);
        }
    }
}
