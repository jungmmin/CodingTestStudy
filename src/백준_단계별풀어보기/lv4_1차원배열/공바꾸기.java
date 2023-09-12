package 백준_단계별풀어보기.lv4_1차원배열;
/**
 * https://www.acmicpc.net/problem/10813
 * 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
 *
 * 도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
 *
 * 공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
 */

import java.io.*;
import java.util.StringTokenizer;

public class 공바꾸기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int bucketCount = Integer.parseInt(st.nextToken());
        int ballCount = Integer.parseInt(st.nextToken());

        int[] bucketArray = new int[bucketCount];
        // 공 백준_단계별풀어보기.배열 생성
        for(int i = 0; i < bucketCount; i++){
            bucketArray[i] = i + 1;
        }

        //공 교환 하기
        for(int i = 0; i < ballCount; i++){
            st = new StringTokenizer(br.readLine());
            int bucketNum1 = Integer.parseInt(st.nextToken()) - 1;
            int bucketNum2 = Integer.parseInt(st.nextToken()) - 1;

            int temp = bucketArray[bucketNum1];
            bucketArray[bucketNum1] = bucketArray[bucketNum2];
            bucketArray[bucketNum2] = temp;
        }

        for(int i = 0; i < bucketCount; i++){
            bw.write(bucketArray[i] + " ");
        }

        bw.close();

    }
}
