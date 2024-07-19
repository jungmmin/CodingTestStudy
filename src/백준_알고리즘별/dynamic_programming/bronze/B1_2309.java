package 백준_알고리즘별.dynamic_programming.bronze;

import java.io.*;
import java.util.Arrays;

public class B1_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dwarfs = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            sum += dwarfs[i];
        }

        loop:
        for(int i = 0; i < dwarfs.length - 1; i++) {
            for(int j = i+1; j < dwarfs.length; j++) {
                if(sum - (dwarfs[i] + dwarfs[j]) == 100) {
                    dwarfs[i] = 0;
                    dwarfs[j] = 0;
                    break loop;
                }
            }
        }

        Arrays.sort(dwarfs);

        for(int i = 2; i < dwarfs.length; i++) {
            System.out.println(dwarfs[i]);
        }
    }
}
