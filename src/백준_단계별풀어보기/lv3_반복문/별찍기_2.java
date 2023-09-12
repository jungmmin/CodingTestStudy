package 백준_단계별풀어보기.lv3_반복문;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2439
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 */
public class 별찍기_2 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int lineCount = Integer.parseInt(br.readLine());

        for(int i = 1; i <= lineCount; i++){
            for(int j = lineCount; j > i; j--){
                sb.append(" ");
            }
            for(int k = 0; k < i; k++){
                sb.append("*");
            }
            sb.append("\n");
        }

        bw.write(String.valueOf(sb));

        bw.close();

    }
}
