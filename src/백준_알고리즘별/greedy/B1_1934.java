package 백준_알고리즘별.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class B1_1934 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int gcd = getGcd(a, b);

            bw.write(Integer.toString(a * b / gcd) + "\n");

        }
        bw.close();
    }

    public static int getGcd(int a, int b){
        if (a < b) {
            int temp = b;
             b = a;
             a = temp;
        }

        while(a % b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

}
