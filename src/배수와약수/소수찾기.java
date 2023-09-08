package 배수와약수;
/**
 * https://www.acmicpc.net/problem/1978
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 */

import java.io.*;
import java.util.StringTokenizer;

public class 소수찾기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] sieveArray = new boolean[1001];
        makeSieve(sieveArray);

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i <N; i++){
            int number = Integer.parseInt(st.nextToken());
            if(!sieveArray[number]){
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));
        bw.close();
    }

    public static void makeSieve(boolean[] numberArray){
        numberArray[0] = true;
        numberArray[1] = true;
        for(int i = 2; i < numberArray.length; i++){
            if(numberArray[i]) continue;

            for(int j = 2*i; j < numberArray.length;  j+=i){
                numberArray[j] = true;
            }
        }
    }
}
