package 문자열;

/**
 * https://www.acmicpc.net/problem/1152
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 */

import java.io.*;

public class 단어의개수 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        String[] SCountArray = S.trim().split(" ");

        if(S.equals(" ")){
            bw.write("0");
        }else{
            bw.write(Integer.toString(SCountArray.length));
        }

        bw.close();

    }
}
