package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.*;

public class P1_합이같은부분집합 {
    static int n, total = 0;
    static boolean flag = false;
    static String answer = "NO";

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            total += array[i];
        }

        DFS(0, 0, array);
        System.out.println(answer);


    }
    static void DFS(int l, int sum, int[]arr){
        if(flag || sum > total - sum){
            return;
        }

        if(l == n){
            if((total - sum) == sum){
                answer = "YES";
                flag = true;
            }

        }else{
            DFS(l + 1, sum + arr[l], arr);
            DFS(l + 1, sum, arr);
        }
    }
}
