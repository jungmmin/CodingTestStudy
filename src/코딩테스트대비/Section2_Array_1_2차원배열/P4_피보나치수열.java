package 코딩테스트대비.Section2_Array_1_2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4_피보나치수열 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        array[0] = 1;
        array[1] = 1;
        sb.append("1 1");

        for(int i = 2; i < N; i++){
            array[i] = array[i-2] + array[i-1];
            sb.append(" ").append(array[i]);
        }

        System.out.println(sb);


    }
}
