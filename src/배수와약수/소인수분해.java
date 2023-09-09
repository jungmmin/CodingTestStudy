package 배수와약수;
/**
 * https://www.acmicpc.net/problem/11653
 * 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 */

import java.io.*;

public class 소인수분해 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 2; i*i <= N; i++){
            while(N%i == 0) {
                sb.append(i + "\n");
                N = N / i;
            }
        }

        if(N != 1){
            sb.append(N);
        }

        bw.write(sb.toString());
        bw.close();

    }
}
