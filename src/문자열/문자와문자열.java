package 문자열;

/**
 * https://www.acmicpc.net/problem/27866
 * 단어
 * $S$와 정수
 * $i$가 주어졌을 때,
 * $S$의
 * $i$번째 글자를 출력하는 프로그램을 작성하시오.
 */

import java.io.*;
import java.util.*;

public class 문자와문자열 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int charIndex = Integer.parseInt(br.readLine()) - 1;

        bw.write(S.charAt(charIndex));
        bw.close();
    }
}
