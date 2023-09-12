package 백준_단계별풀어보기.lv10_기하_직사각형과삼각형;



/**
 * https://www.acmicpc.net/problem/14215
 * 영선이는 길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.
 *
 * 영선이는 세 막대를 이용해서 아래 조건을 만족하는 삼각형을 만들려고 한다.
 *
 * 각 막대의 길이는 양의 정수이다
 * 세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
 * 삼각형의 둘레를 최대로 해야 한다.
 * a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class 세막대 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] sticks = new int[3];
        int max = 0;
        int otherSum = 0;
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < sticks.length; i++) {
            sticks[i] = Integer.parseInt(st.nextToken());
            if(max < sticks[i]){
                max = sticks[i];
            }
            otherSum += sticks[i];
        }
        otherSum -= max;

        if(max >= otherSum){
            max = max - (max - otherSum + 1);
        }
        System.out.println(max + otherSum);


    }
}
