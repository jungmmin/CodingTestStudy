package 백준_단계별풀어보기.lv12_브루트포스;

import java.io.*;

public class P2_분해합 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n  = br.readLine();
        int number = Integer.parseInt(n);
        int answer = 0;

        for(int i = number - 9 * n.length(); i < number; i++){
            int sum = 0;
            int temp = i;
            while (temp != 0) {
                sum += temp % 10;
                temp = temp/10;
            }
            if (sum + i == number) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
