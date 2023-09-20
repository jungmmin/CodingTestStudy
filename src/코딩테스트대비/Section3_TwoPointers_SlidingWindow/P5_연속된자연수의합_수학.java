package 코딩테스트대비.Section3_TwoPointers_SlidingWindow;

import java.io.*;

public class P5_연속된자연수의합_수학 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int result = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n -= cnt;
            if (n % cnt == 0) {
                result++;
            }
        }
        System.out.println(result);
        bw.close();
    }
}
