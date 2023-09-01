package 배열;

import java.io.*;
import java.util.*;

public class 평균 {
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Double[] scoreArray = new Double[N];
        Double scoreMax = 0.;
        Double changedScoreSum = 0.;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            Double score = Double.parseDouble(st.nextToken());
            scoreArray[i] = score;
            if(scoreMax < score){
                scoreMax = score;
            }
        }
        for(int i = 0; i < N; i++){
            changedScoreSum += scoreArray[i] / scoreMax * 100;
            }
        bw.write(Double.toString(changedScoreSum / N));
        bw.close();
    }
}
