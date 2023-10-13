package 코딩테스트대비.Section9_GreedyAlgorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;

public class P1_씨름선수 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Body[] array = new Body[n];
        int answer = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cm = Integer.parseInt(st.nextToken());
            int kg = Integer.parseInt(st.nextToken());
            array[i] = new Body(cm, kg);
        }

        Arrays.sort(array, Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
//            System.out.println("kg = " + array[i].kg + " max = " + max);
            if(array[i].kg > max){
                max = array[i].kg;
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static class Body implements Comparable<Body> {
        int cm;
        int kg;
        public Body(int cm, int kg) {
            this.cm = cm;
            this.kg = kg;
        }
        @Override
        public int compareTo(Body b){

            if(cm > b.cm){
                return 1;
            }else if(cm < b.cm){
                return -1;
            }else{
                return 0;
            }

        }
    }
}
