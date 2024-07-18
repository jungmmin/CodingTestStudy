package 백준_알고리즘별.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class B1_1037 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nCount = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.parseInt(st.nextToken());
        int min = max;
        for(int i = 1; i < nCount; i++){
            int n = Integer.parseInt(st.nextToken());
            if (max < n) {
                max = n;
            }
            if(min > n){
                min = n;
            }
        }

        bw.write(min * max + "\n");
        bw.close();
    }
}
