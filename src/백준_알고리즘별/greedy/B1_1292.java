package 백준_알고리즘별.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B1_1292 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                list.add(i);
            }
            if (list.size() == 1001) {
                break;
            }
        }

        int sum = 0;
        for (int i = n; i <= m; i++) {

            sum += list.get(i-1);
        }

        bw.write(Integer.toString(sum));
        bw.close();
    }
}
