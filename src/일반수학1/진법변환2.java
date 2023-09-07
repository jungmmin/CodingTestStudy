package 일반수학1;

/**
 * https://www.acmicpc.net/problem/11005
 * 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
 *
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 *
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 */

import java.io.*;
import java.util.StringTokenizer;

public class 진법변환2 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while(N > 0){
            int remainder = N%B;
            if(remainder >= 10){
                sb.append((char)(N%B + 'A' - 10));
            }else{
                sb.append(N%B);
            }

            N = N / B;
        }

        bw.write(sb.reverse().toString());
        bw.close();
    }
}
