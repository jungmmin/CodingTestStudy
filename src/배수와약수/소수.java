package 배수와약수;

/**
 * https://www.acmicpc.net/problem/2581
 * 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
 *
 * 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
 */

import java.io.*;

public class 소수 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] sosuArray = new boolean[10001];

        makeSosu(sosuArray);

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        int sum = 0;
        int minPNum = -1;

        for (int i = start; i <= end; i++) {
            if(!sosuArray[i]){
                sum += i;
                if(minPNum == -1){
                    minPNum = i;
                }
            }
        }

        if(sum > 0){
            bw.write(Integer.toString(sum) + "\n");
        }
        bw.write(Integer.toString(minPNum));
        bw.close();



    }

    public static void makeSosu(boolean[] array){
        array[0] = true;
        array[1] = true;

        for(int i = 2; i < array.length; i++){
            if(array[i] == false){
                for(int j = i*2; j < array.length; j+=i){
                    array[j] = true;
                }
            }
        }
    }
}
