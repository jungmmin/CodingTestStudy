package 백준_단계별풀어보기.lv10_기하_직사각형과삼각형;

import java.io.*;
import java.util.StringTokenizer;

public class 대지 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());

        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x > xMax){
                xMax = x;
            }
            if(x < xMin){
                xMin = x;
            }
            if(y > yMax){
                yMax = y;
            }
            if(y < yMin){
                yMin = y;
            }

        }

        bw.write(Integer.toString((xMax - xMin) * (yMax - yMin)));
        bw.close();

    }
}
