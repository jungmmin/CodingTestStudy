package 백준_단계별풀어보기.lv5_문자열;

/**
 * https://www.acmicpc.net/problem/9086
 * 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
 */

import java.io.*;

public class 문자열 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String s = br.readLine();
            sb.append(Character.toString(s.charAt(0)) + Character.toString(s.charAt(s.length() - 1)) + "\n");
        }
        bw.write(String.valueOf(sb));
        bw.close();
    }
}
