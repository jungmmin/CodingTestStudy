package 백준_단계별풀어보기.lv3_반복문;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2438
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 */
public class 별찍기_1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int LineCount = Integer.parseInt(br.readLine());

        for(int i = 0; i < LineCount; i++){
            for(int j = 0; j <= i; j++){
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.close();

    }

}
