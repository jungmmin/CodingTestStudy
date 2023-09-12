package 백준_단계별풀어보기.lv4_1차원배열;
/**
 * https://www.acmicpc.net/problem/5597
 * X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
 *
 * 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
 */

import java.io.*;

public class 과제안내신분 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[30];

        for(int i = 0; i < 28; i++){
            int checkNum = Integer.parseInt(br.readLine());
            array[checkNum - 1] = checkNum;
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                bw.write((i + 1) + "\n");
            }
        }
        bw.close();
    }
}
