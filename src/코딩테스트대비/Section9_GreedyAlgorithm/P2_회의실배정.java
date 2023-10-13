package 코딩테스트대비.Section9_GreedyAlgorithm;

import java.io.*;
import java.util.*;

public class P2_회의실배정 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Meeting[] array = new Meeting[n];
        int liveTime = 0;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sT = Integer.parseInt(st.nextToken());
            int eT = Integer.parseInt(st.nextToken());

            array[i] = new Meeting(sT, eT);
        }

        Arrays.sort(array);

        for (Meeting m : array) {
            if(m.startT >= liveTime){
                answer++;
                liveTime = m.endT;
            }
        }

        System.out.println(answer);

    }

    public static class Meeting implements Comparable<Meeting>{
        int startT;
        int endT;

        public Meeting(int startT, int endT) {
            this.startT = startT;
            this.endT = endT;
        }
        @Override
        public int compareTo(Meeting m){
            if(endT == m.endT){
                return startT - m.startT;
            }
            return endT - m.endT;
        }

    }
}
