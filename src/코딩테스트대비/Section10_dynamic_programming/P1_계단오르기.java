package 코딩테스트대비.Section10_dynamic_programming;

import java.io.*;

public class P1_계단오르기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dy = new int[36];

        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i < dy.length; i++) {
            dy[i] = dy[i-1] + dy[i-2];
        }

        System.out.println(dy[n]);
    }
}
