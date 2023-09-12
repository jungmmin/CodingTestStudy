package 백준_단계별풀어보기.lv7_2차원배열;
/**
 * https://www.acmicpc.net/problem/2738
 * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 */

import java.io.*;
import java.util.StringTokenizer;

public class 행렬덧셈 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] array1 = new int[N][M];

        for(int i = 0; i < N; i++){
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                array1[i][j] = Integer.parseInt(line[j]);
            }
        }
        for(int i = 0; i < N; i++){
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                sb.append(array1[i][j] + Integer.parseInt(line[j]) + " ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }

}
