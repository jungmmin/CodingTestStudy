package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.*;

public class P4_중복순열 {
    static int n, m;
    static int[] pm;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        pm = new int[m];

        DFS(0);

    }
    static void DFS(int l){
        if (l == n) {
            for(int x : pm){
                System.out.print(x + " ");
            }
            System.out.println();
        }else{
            for (int i = 1; i <= n; i++) {
                pm[l] = i;
                DFS(l+1);
            }
        }
    }
}
