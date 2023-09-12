package 백준_단계별풀어보기.lv5_문자열;

/**
 * https://www.acmicpc.net/problem/11720
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */

import java.io.*;

public class 숫자의합 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            sum += Integer.parseInt(Character.toString(s.charAt(i)));
        }
        bw.write(Integer.toString(sum));
        bw.close();
    }
}
