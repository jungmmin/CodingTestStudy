package 반복문;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11022
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class A더하기B_8 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int testCount = Integer.parseInt(br.readLine());

        for(int i = 1; i <= testCount; i++){
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            sb.append("Case #");
            sb.append(i);
            sb.append(": ");
            sb.append(num1);
            sb.append(" + ");
            sb.append(num2);
            sb.append(" = ");
            sb.append(num1 + num2);

            System.out.println(sb);
        }

        bw.close();


    }

}
