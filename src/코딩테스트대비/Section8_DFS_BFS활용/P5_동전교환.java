package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P5_동전교환 {
    static int n, m, answer = Integer.MAX_VALUE;
    static Integer[] array;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        array = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array, Collections.reverseOrder());

        m = Integer.parseInt(br.readLine());

        DFS(0, 0);
        System.out.println(answer);
    }

    public static void DFS(int l, int sum) {
        if(sum > m || l > answer){
            return;
        }
        if(sum == m){
            answer = Math.min(l, answer);
        }else{
            for(int i = 0; i < n; i++){
                DFS(l+1, sum + array[i]);
            }

        }
    }
}
