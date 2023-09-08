package 일반수학1;

/**
 * https://www.acmicpc.net/problem/1193
 * 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
 *
 * 1/1	1/2	1/3	1/4	1/5	…
 * 2/1	2/2	2/3	2/4	…	…
 * 3/1	3/2	3/3	…	…	…
 * 4/1	4/2	…	…	…	…
 * 5/1	…	…	…	…	…
 * …	…	…	…	…	…
 * 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 *
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 */

import java.io.*;

public class 분수찾기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int X = Integer.parseInt(br.readLine());

        int i = 0;
        int indexMaxNum = 0;

        while(indexMaxNum < X){
            i++;
            indexMaxNum = i * (i+1) / 2;
        }

        int rank = indexMaxNum - X;

        if(i%2 == 0){
            bw.write((i - rank) + "/" + (1 + rank));
        }else{
            bw.write((1 + rank) + "/" + (i - rank));
        }

        bw.close();

    }
}
