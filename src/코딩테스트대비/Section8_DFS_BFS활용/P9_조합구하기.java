package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.*;

public class P9_조합구하기 {
    static int n, m;
    static int[] combi;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        combi = new int[m];
        DFS(0, 1);


    }
    public static void DFS(int l, int s){
        if(l == m){
            System.out.println(combi[0] + " " + combi[1]);
        }else{
            for (int i = s; i <= n; i++) {
                combi[l] = i;
                DFS(l+1, i+1);
            }
        }
    }
}
