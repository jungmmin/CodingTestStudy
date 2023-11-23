package 코딩테스트대비.Section10_dynamic_programming;

import java.io.*;
import java.util.*;

public class P5_동전교환_냅색알고리즘 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] dy = new int[m+1];

        Arrays.fill(dy, 501);
        dy[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = array[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j-array[i]] + 1);
            }
        }

        System.out.println(dy[m]);
    }
}
