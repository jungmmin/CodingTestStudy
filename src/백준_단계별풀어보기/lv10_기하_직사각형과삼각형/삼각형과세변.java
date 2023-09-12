package 백준_단계별풀어보기.lv10_기하_직사각형과삼각형;

/**
 * https://www.acmicpc.net/problem/5073
 * 삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.
 *
 * Equilateral :  세 변의 길이가 모두 같은 경우
 * Isosceles : 두 변의 길이만 같은 경우
 * Scalene : 세 변의 길이가 모두 다른 경우
 * 단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다. 예를 들어 6, 3, 2가 이 경우에 해당한다. 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
 *
 * 세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.
 */

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 삼각형과세변 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] sideArray = new int[3];

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < sideArray.length; i++){
                sideArray[i] = Integer.parseInt(st.nextToken());
            }
            if(sideArray[0] == 0 && sideArray[1] == 0 && sideArray[2] == 0){
                break;
            }

            if(isTrinagle(sideArray)){
                if(sameSideCount(sideArray) == 3){
                    System.out.println("Equilateral");
                }else if(sameSideCount(sideArray) == 2){
                    System.out.println("Isosceles");
                }else{
                    System.out.println("Scalene");
                }
            }else{
                System.out.println("Invalid");
            }



        }

    }

    public static boolean isTrinagle(int[] array){

        int max = 0;
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
            sum += array[i];
        }
        if(max < sum - max){
            return true;
        }else{
            return false;
        }

    }

    public static int sameSideCount(int[] array){
        Set set = new HashSet<Integer>();

        for(int i = 0; i < array.length; i++){
            set.add(array[i]);
        }
        return array.length - set.size() + 1;
    }
}
