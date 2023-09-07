package 일반수학1;

import java.io.*;

public class 세탁소사장동혁 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] coin = {25, 10, 5, 1};

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            int change = Integer.parseInt(br.readLine());

            for(int i = 0; i < coin.length; i++){
                sb.append(change/coin[i] + " ");
                change = change%coin[i];
            }
            sb.append("\n");

        }

        bw.write(sb.toString());
        bw.close();
    }
}
