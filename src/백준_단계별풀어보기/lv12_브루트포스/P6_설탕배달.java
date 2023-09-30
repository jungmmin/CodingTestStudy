package 백준_단계별풀어보기.lv12_브루트포스;

import java.io.*;

public class P6_설탕배달 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int n = Integer.parseInt(br.readLine());

        while(true){
            if(n % 5 == 0){
                answer = n / 5 + answer;
                break;
            }else if(n < 0){
                answer = -1;
                break;
            }
            n = n - 3;
            answer++;
        }

        System.out.println(answer);
    }
}
