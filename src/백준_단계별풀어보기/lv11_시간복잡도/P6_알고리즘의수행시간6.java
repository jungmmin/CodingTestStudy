package 백준_단계별풀어보기.lv11_시간복잡도;

/**
 * https://www.acmicpc.net/problem/24267
 *
 * 오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
 *
 * 입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.
 *
 * MenOfPassion 알고리즘은 다음과 같다.
 *
 * MenOfPassion(A[], n) {
 *     sum <- 0;
 *     for i <- 1 to n - 2
 *         for j <- i + 1 to n - 1
 *             for k <- j + 1 to n
 *                 sum <- sum + A[i] × A[j] × A[k]; # 코드1
 *     return sum;
 * }
 */

import java.io.*;

public class P6_알고리즘의수행시간6 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        System.out.println(n * (n-1) * (n-2) / 6);
        System.out.println(3);

    }
}
