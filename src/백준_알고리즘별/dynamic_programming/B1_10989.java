package 백준_알고리즘별.dynamic_programming;

import java.io.*;


public class B1_10989 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(br.readLine());
            cnt[number]++;
        }
     for (int i = 1; i < cnt.length; i++) {
            for(int j = cnt[i]; j > 0; j--) {
                bw.write(String.format("%d\n",i));
            }
        }

     bw.close();
    }

}
