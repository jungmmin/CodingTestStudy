package 백준_단계별풀어보기.lv5_문자열;

/**
 * https://www.acmicpc.net/problem/2675
 * 백준_단계별풀어보기.문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 백준_단계별풀어보기.문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
 *
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class 문자열반복 {
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(st.nextToken());
            char[] S = st.nextToken().toCharArray();

            for(char c : S){
                for(int i = 0; i < R; i++){
                    sb.append(c);
                }
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();

    }
}
