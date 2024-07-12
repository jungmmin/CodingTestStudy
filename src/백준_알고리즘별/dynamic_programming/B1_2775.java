package 백준_알고리즘별.dynamic_programming;

import java.io.*;

public class B1_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int[][] array = new int[15][15];

        for (int i = 1; i < 15; i++) {
            array[0][i] = i;
            array[i][1] = 1;
        }

        for (int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                array[i][j] = array[i][j-1] + array[i-1][j];
            }
        }


        for(int t=0;t<T;t++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            bw.write(array[k][n] + "\n");

        }

        bw.close();
    }
}
