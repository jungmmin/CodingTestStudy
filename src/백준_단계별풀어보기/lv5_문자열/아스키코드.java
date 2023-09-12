package 백준_단계별풀어보기.lv5_문자열;

/**
 * https://www.acmicpc.net/problem/11654
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 */

import java.io.*;

public class 아스키코드 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString((int)br.readLine().charAt(0)));
        bw.close();
    }
}
