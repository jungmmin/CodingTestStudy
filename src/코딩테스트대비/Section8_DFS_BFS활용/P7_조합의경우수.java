package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.StringTokenizer;

public class P7_조합의경우수 {
    static int n, r;
    static int[][] memo;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        memo = new int[n+1][n+1];

        int answer = DFS(n, r);
        System.out.println(answer);
    }
    public static int DFS(int n, int r){
        if(memo[n][r] != 0){
            return memo[n][r];
        }
        if(r == 0 || n == r){
            return 1;
        }else{
            return memo[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        }
    }

}
