package 백준_알고리즘별.greedy;

import java.io.*;

public class B1_2748 {
    public static long[] pivoArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

         pivoArray = new long[91];


        for (int i = 0; i < pivoArray.length; i++) {
            pivoArray[i] = pivo(i);
        }

        int n = Integer.parseInt(br.readLine());
        bw.write(Long.toString(pivoArray[n]));
        bw.close();

    }

    public static long pivo(int n) {
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        if(pivoArray[n] != 0){
            return pivoArray[n];
        }

        return pivoArray[n] = pivo(n-1) + pivo(n-2);
    }
}
