package 배수와약수;

/**
 * https://www.acmicpc.net/problem/5086
 * 4 × 3 = 12이다.
 *
 * 이 식을 통해 다음과 같은 사실을 알 수 있다.
 *
 * 3은 12의 약수이고, 12는 3의 배수이다.
 *
 * 4도 12의 약수이고, 12는 4의 배수이다.
 *
 * 두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
 *
 * 첫 번째 숫자가 두 번째 숫자의 약수이다.
 * 첫 번째 숫자가 두 번째 숫자의 배수이다.
 * 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class 배수와약수 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int number1 = Integer.parseInt(st.nextToken());
            int number2 = Integer.parseInt(st.nextToken());

            if(number1 == 0 && number2 == 0){
                break;
            }

            if(number1 % number2 == 0){
                bw.write("multiple\n");
            }else if(number2 % number1 == 0){
                bw.write("factor\n");
            }else{
                bw.write("neither\n");
            }

        }
        bw.close();

    }
}
