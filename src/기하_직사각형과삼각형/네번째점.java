package 기하_직사각형과삼각형;
/**
 * https://www.acmicpc.net/problem/3009
 * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 */

import java.io.*;
import java.util.StringTokenizer;

public class 네번째점 {
    public static void main(String args[]) throws IOException {

        int[] xArray = new int[3];
        int[] yArray = new int[3];
        int x = 0, y = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine());
            xArray[i] = Integer.parseInt(st.nextToken());
            yArray[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < 3; i++){
            if(cntDuplicate(xArray, xArray[i]) < 2){
                x = xArray[i];
            }
            if(cntDuplicate(yArray, yArray[i]) < 2){
                y = yArray[i];
            }
        }

        System.out.println(x + " " + y);


    }
    public static int cntDuplicate(int[] array, int number){

        int cnt = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                cnt++;
            }
        }
        return cnt;
    }
}
