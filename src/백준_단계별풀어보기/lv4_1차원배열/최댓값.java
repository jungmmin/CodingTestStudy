package 백준_단계별풀어보기.lv4_1차원배열;

import java.io.*;

public class 최댓값 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxNum = 0;
        int maxNumIndex = 0;
        for(int i = 1; i <= 9; i++){

            int num = Integer.parseInt(br.readLine());

            if(maxNum < num){
                maxNum = num;
                maxNumIndex = i;
            }
        }
        bw.write(maxNum + "\n");
        bw.write(String.valueOf(maxNumIndex));
        bw.close();
    }
}
