package 코딩테스트대비.Section10_dynamic_programming;

import java.io.*;
import java.util.*;

public class P6_최대점수구하기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        Problem[] array = new Problem[n];

        int[] dy = new int[t+1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int point = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            array[i] = new Problem(point, time);
        }

        for (int i = 0; i < n; i++) {
            for (int j = t; j >= array[i].time; j--) {
                dy[j] = Math.max(dy[j], dy[j - array[i].time] + array[i].point);
            }
        }

        System.out.println(dy[t]);
    }

    public static class Problem{
        int point;
        int time;

        public Problem(int point, int time) {
            this.point = point;
            this.time = time;
        }
    }
}
