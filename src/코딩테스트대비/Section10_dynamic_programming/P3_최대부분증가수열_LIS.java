package 코딩테스트대비.Section10_dynamic_programming;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3_최대부분증가수열_LIS {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dy = new int[n];
        int[] array = new int[n];

        Arrays.fill(dy, 1);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i]= Integer.parseInt(st.nextToken());
        }

        dy[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if(array[i] > array[j] && dy[j] + 1 > dy[i]){
                    dy[i] = dy[j] + 1;
                }
            }
        }

        int max = 0;
        for (int x : dy) {
            if (max < x) {
                max = x;
            }
        }

        System.out.println(max);

    }
}
