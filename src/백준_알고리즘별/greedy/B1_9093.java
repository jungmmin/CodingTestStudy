package 백준_알고리즘별.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class B1_9093 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                char[] s = st.nextToken().toCharArray();
                for (int j = s.length - 1; j >= 0; j--) {
                    bw.write(s[j]);
                }
                bw.write(" ");
            }
            bw.write("\n");
        }

        bw.close();

    }
}
