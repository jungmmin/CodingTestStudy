package 코딩테스트대비.Section2_Array_1_2차원배열;

import java.io.*;
import java.util.StringTokenizer;

public class P10_봉우리 {
    public static void main(String args[])throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] array = new int[n+2][n+2];
        int cnt = 0;

        for (int i = 1; i < array.length - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < array.length - 1; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - 1; j++) {
               if(array[i][j] > array[i-1][j] && array[i][j] > array[i+1][j]
                       && array[i][j] > array[i][j-1] && array[i][j] > array[i][j+1]){
                   cnt++;
               }
            }
        }

        bw.write(Integer.toString(cnt));
        bw.close();

    }
}
