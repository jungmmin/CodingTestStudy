package 백준_단계별풀어보기.lv10_기하_직사각형과삼각형;

/**
 * https://www.acmicpc.net/problem/27323
 * 정수 A, B 가 주어진다. 세로 길이가 A cm, 가로 길이가 B cm 인 아래와 같은 직사각형의 넓이를 cm2 단위로 구하시오.
 */
import java.io.*;

public class 직사각형 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number1 = Integer.parseInt(br.readLine());
        int number2 = Integer.parseInt(br.readLine());

        System.out.println(number1 * number2);
    }
}
