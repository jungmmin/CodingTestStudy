package 백준_단계별풀어보기.lv7_2차원배열;

import java.io.*;
import java.util.StringTokenizer;

public class 색종이 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[][] page = new boolean[100][100];
        int count = 0;

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int i = x; i < x+10; i++){
                for(int j = y; j < y + 10; j++){
                    if(page[i][j] == false){
                        count++;
                    }
                    page[i][j] = true;
                }
            }
        }

        bw.write(Integer.toString(count));
        bw.close();
    }
}
