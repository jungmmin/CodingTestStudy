package 백준_단계별풀어보기.lv4_1차원배열;

/**
 * https://www.acmicpc.net/problem/10818
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */
import java.io.*;

public class 최소최대 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int maxNum = -1000001, minNum = 1000001;

        for(int i = 0; i < N; i++){
            int arrayNumber = Integer.parseInt(br.readLine());
            if(maxNum < arrayNumber){
                maxNum = arrayNumber;
            }
            if(minNum > arrayNumber){
                minNum = arrayNumber;
            }
        }

        bw.write(minNum + " " + maxNum);
        bw.close();
    }
}
