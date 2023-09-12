package 백준_단계별풀어보기.lv5_문자열;

/**
 * https://www.acmicpc.net/problem/10809
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 */

import java.io.*;
import java.util.Arrays;

public class 알파벳찾기 {
    public static void main(String args[]) throws IOException {
        // a = 97 A = 65
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int[] checkArray = new int[26];
        Arrays.fill(checkArray, -1);

        for(int i = 0; i < s.length(); i++){
            int findIndex = (int)s.charAt(i) - 97;
            if(checkArray[findIndex] == -1){
                checkArray[findIndex] = i;
            }
        }
        for(int i = 0; i < checkArray.length; i++){
            sb.append(checkArray[i] + " ");
        }

        bw.write(String.valueOf(sb));
        bw.close();
    }
}
