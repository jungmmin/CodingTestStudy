package 코딩테스트대비.Section3_TwoPointers_SlidingWindow;


import java.io.*;

public class P5_연속된자연수의합 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n/2+1];
        int cnt = 0, lt = 0, sum =0;

        for (int i = 0; i < n / 2 + 1; i++) {
            array[i] = i + 1;
        }

        for (int rt = 0; rt < n / 2 + 1; rt++) {
            sum+=array[rt];
            if (sum == n) {
                cnt++;
            }
            while (sum >= n) {
                sum -= array[lt++];
                if (sum == n) {
                    cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.close();

    }
}
