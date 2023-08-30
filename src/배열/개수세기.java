package 배열;

/**
 * https://www.acmicpc.net/problem/10807
 * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
 */

import java.io.*;
import java.util.StringTokenizer;

public class 개수세기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrayLength = Integer.parseInt(br.readLine());
        int[] numberArray = new int[arrayLength];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int checkNumber = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < arrayLength; i++){
            int arrayNumber = Integer.parseInt(st.nextToken());
            numberArray[i] = arrayNumber;
            if(arrayNumber == checkNumber){
                count++;
            }
        }

        bw.write(count + "");
        bw.close();
    }
}
