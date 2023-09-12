package 백준_단계별풀어보기.lv6_심화1;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2444
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 */
public class 별찍기_7 {
    public static void main(String args[])throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int spaceCount = 0;
        int starCount = 0;

        for(int i = 1; i <= 2*N-1; i++){
            if(i <= N){
                spaceCount = N - i;
                starCount = 2 * i -1;
            }else{
                spaceCount =  i - N;
                starCount -= 2;
            }
            for(int j = 0; j < spaceCount; j++){
                bw.write(" ");
            }
            for(int k = 0; k < starCount; k++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}

