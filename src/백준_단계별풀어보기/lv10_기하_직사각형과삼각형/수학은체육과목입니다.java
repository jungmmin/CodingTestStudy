package 백준_단계별풀어보기.lv10_기하_직사각형과삼각형;



/**
 * https://www.acmicpc.net/submit/15894
 * 성원이는 수학을 정말 못 하는 고등학생이다. 수학을 못하는 대신 근성과 팔 힘이 뛰어난 성원이는 수학 시험에서 수학 지식을 사용하지 않고 근성과 체력을 사용해 문제를 푼다.
 * 지난 시험에서는 아래 사진에 나와있는 문제를 근성과 체력을 사용해 열심히 풀었지만 사진에서 볼 수 있듯이 틀려버리고 말았다!
 */

import java.io.*;

public class 수학은체육과목입니다 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double n = Integer.parseInt(br.readLine());

        System.out.println(String.format("%.0f", 4*n));
    }
}
