package 백준_단계별풀어보기.lv7_2차원배열;

/**
 * https://www.acmicpc.net/problem/2566
 *  9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
 */

import java.io.*;
import java.util.StringTokenizer;

public class 최댓값 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = -1;
        int row = 0;
        int coloum = 0;

        for(int i = 1; i <= 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= 9; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num > max){
                    max = num;
                    row = i;
                    coloum = j;
                }
            }
        }
        bw.write(max + "\n");
        bw.write(row + " " + coloum);
        bw.close();

    }
}
