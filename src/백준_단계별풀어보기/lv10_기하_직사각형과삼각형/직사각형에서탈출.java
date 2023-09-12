package 백준_단계별풀어보기.lv10_기하_직사각형과삼각형;

/**
 * https://www.acmicpc.net/problem/1085
 * 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
 * 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 */

import java.io.*;
import java.util.StringTokenizer;

public class 직사각형에서탈출 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = 1000;
        int[] array = {w - x, h - y, x, y};
        for (int i : array) {
            if(min > i){
                min = i;
            }
        }

        System.out.println(min);
    }
}
