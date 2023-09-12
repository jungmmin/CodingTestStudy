package 백준_단계별풀어보기.lv4_1차원배열;

/**
 * https://www.acmicpc.net/problem/10871
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */

import java.io.*;
import java.util.*;

public class X보다작은수 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringTokenizer numberLine = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int number = Integer.parseInt(numberLine.nextToken());
            if(X > number){
                sb.append(Integer.toString(number) + " ");
            }
        }

        bw.write(String.valueOf(sb));
        bw.close();
    }
}
