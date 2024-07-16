package 백준_알고리즘별.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class B1_11050 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = fac(N) / (fac(K) * fac(N - K));
        bw.write(Integer.toString(result));

        bw.close();
    }
    public static int fac(int n) {
        int sum = 1;

        for (int i = 2; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
}
