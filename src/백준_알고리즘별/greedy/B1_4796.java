package 백준_알고리즘별.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class B1_4796 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if(L == 0 && P == 0 && V == 0) break;

            int days = V / P * L;
            int days2 = V % P;

            if (days2 >= L) {
                days2 = L;
            }

            bw.write("Case " + count++ + ": " +(days + days2)  + "\n");
        }
        bw.close();

    }
}
