package 백준_단계별풀어보기.lv3_반복문;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10952
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

public class A더하기B_5 {
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if(num1 == 0 && num2 == 0){
                break;
            }

            bw.write(num1 + num2 + "\n");
        }

        bw.close();
    }

}
