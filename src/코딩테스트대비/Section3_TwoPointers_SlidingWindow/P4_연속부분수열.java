package 코딩테스트대비.Section3_TwoPointers_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4_연속부분수열 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] array = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, cnt = 0, sum = 0;

        for (int end = 0; end < n; end++) {
            sum += array[end];
            while(sum > m){
                sum -= array[start++];
            }
            if (sum == m) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
