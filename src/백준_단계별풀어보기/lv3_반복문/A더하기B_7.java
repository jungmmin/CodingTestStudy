package 백준_단계별풀어보기.lv3_반복문;

import java.io.*;
import java.util.StringTokenizer;

/*
https://www.acmicpc.net/problem/11021
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class A더하기B_7 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseCount = Integer.parseInt(br.readLine());

        for(int i = 1; i <= caseCount; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + (num1 + num2) + "\n");

        }
        bw.close();
    }
}
