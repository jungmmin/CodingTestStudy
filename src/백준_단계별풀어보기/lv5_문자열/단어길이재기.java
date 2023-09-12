package 백준_단계별풀어보기.lv5_문자열;

/**
 * https://www.acmicpc.net/problem/2743
 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
 */
import java.io.*;

public class 단어길이재기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        bw.write(Integer.toString(s.length()));
        bw.close();
    }
}
