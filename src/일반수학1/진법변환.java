package 일반수학1;

/**
 * https://www.acmicpc.net/problem/2745
 * B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
 *
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 *
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 */
import java.io.*;
import java.util.StringTokenizer;

public class 진법변환 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] N = st.nextToken().toCharArray();
        int B = Integer.parseInt(st.nextToken());
        int sum = 0;

        for(int i = N.length - 1; i >= 0; i--){
            int num;
            if(Character.isLetter(N[i])){
                num = N[i] - 'A' + 10;
            }else{
                num = Integer.parseInt(String.valueOf(N[i]));
            }
            sum += Math.pow(B, N.length - 1 - i) * num;
        }

        bw.write(Integer.toString(sum));
        bw.close();
    }
}
