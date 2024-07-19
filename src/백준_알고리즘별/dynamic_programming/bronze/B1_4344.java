package 백준_알고리즘별.dynamic_programming.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class B1_4344 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int C = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < C; i++){
            String s = sc.nextLine();
            // 점수 정보
            int[] scoreData = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
            
            // 학생 수
            int n = scoreData[0];
            // 총점
            double sum = 0;
            // 평균
            double avg = 0;
            // 평균을 넘는 학생수
            int cnt = 0;

            // 점수 합 계산
            for (int j = 1; j < scoreData.length; j++) {
                sum += scoreData[j];
            }
            // 평균 계산
            avg = sum/n;

            // 평균을 넘는 학생수 카운트
            for(int j = 1; j < scoreData.length; j++){
                if(scoreData[j] > avg){
                    cnt++;
                }
            }

            System.out.println(String.format("%.3f", (double)cnt/n * 100)  + "%");
        }


    }
}
