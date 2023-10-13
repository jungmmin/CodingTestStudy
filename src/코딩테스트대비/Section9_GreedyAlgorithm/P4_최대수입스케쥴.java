package 코딩테스트대비.Section9_GreedyAlgorithm;

import java.io.*;
import java.util.*;

public class P4_최대수입스케쥴 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Scedule[] array = new Scedule[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int answer = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int money = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());
            array[i] = new Scedule(money, day);
        }
        Arrays.sort(array);

        int j = 0;
        int max = array[0].day;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if(array[j].day < i) break;
                pq.offer(array[j].money);
            }
            if(!pq.isEmpty()){
                answer += pq.poll();
            }

        }

        System.out.println(answer);

    }

    public static class Scedule implements Comparable<Scedule>{
        int money;
        int day;

        public Scedule(int money, int day) {
            this.money = money;
            this.day = day;
        }

        @Override
        public int compareTo(Scedule sc) {
            return sc.day - day;
        }
    }
}
