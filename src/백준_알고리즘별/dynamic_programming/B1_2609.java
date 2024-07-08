package 백준_알고리즘별.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int bigN = n;
        int smallN = m;

        // small에 큰 숫자가 들어가면 교체
        if (bigN < smallN) {
            int temp = bigN;
            bigN = smallN;
            smallN = temp;
        }


        int r;
        while(bigN % smallN > 0){
            r = bigN % smallN;
            bigN = smallN;
            smallN = r;
        }

        System.out.println(smallN);
        System.out.println(n * m / smallN);
    }
}
