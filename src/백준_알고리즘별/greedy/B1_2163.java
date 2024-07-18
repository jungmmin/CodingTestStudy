package 백준_알고리즘별.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class B1_2163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        bw.write(Integer.toString(n * m - 1));
        bw.close();
    }
}
