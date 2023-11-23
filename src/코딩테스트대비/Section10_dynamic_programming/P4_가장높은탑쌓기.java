package 코딩테스트대비.Section10_dynamic_programming;

import java.io.*;
import java.util.*;

public class P4_가장높은탑쌓기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Brick[] array = new Brick[n];
        int[] dy = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            array[i] = new Brick(s, h, w);
        }

        Arrays.sort(array, Collections.reverseOrder());

        dy[0] = array[0].h;
        int max = dy[0];
        for (int i = 1; i < n; i++) {
            int max_h = 0;
            for (int j = 0; j < i; j++) {
                if(max_h < dy[j] && array[i].w < array[j].w){
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + array[i].h;
            max = Math.max(max, dy[i]);

        }

        System.out.println(max);
    }

    public static class Brick implements Comparable<Brick>{
        int s;
        int h;
        int w;

        public Brick(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Brick b) {
            return this.s - b.s;
        }
    }
}
