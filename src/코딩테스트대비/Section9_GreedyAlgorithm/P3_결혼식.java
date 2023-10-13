package 코딩테스트대비.Section9_GreedyAlgorithm;

import java.io.*;
import java.util.*;

public class P3_결혼식 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<timeSE> list = new ArrayList<>();
        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int stime = Integer.parseInt(st.nextToken());
            int etime = Integer.parseInt(st.nextToken());

            list.add(new timeSE(1, stime));
            list.add(new timeSE(0, etime));
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).se == 1){
                cnt++;
            }else{
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }
    // se = 1 -> start se = 0 -> end
    public static class timeSE implements Comparable<timeSE>{
        int se;
        int t;

        public timeSE(int se, int t) {
            this.se = se;
            this.t = t;
        }

        @Override
        public int compareTo(timeSE se) {
            if(this.t == se.t){
                return this.se - se.se;
            }else{
                return this.t - se.t;
            }
        }
    }
}
