package 백준_단계별풀어보기.lv4_1차원배열;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10811
 * 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
 *
 * 도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
 *
 * 바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
 */
public class 바구니뒤집기 {
    public static void main(String args[]) throws IOException {
        // while(startIndex < endIndex) 로
        // 하고startIndex는 ++ endIndex는 -- 로 하는것이 더 깔끔해보임

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int bucketCount = Integer.parseInt(st.nextToken());
        int changeCount = Integer.parseInt(st.nextToken());

        int[] bucketArray = new int[bucketCount];
        for(int i = 0; i < bucketCount; i++){
            bucketArray[i] = i+1;
        }

        for(int i = 0; i < changeCount; i++){
            st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken());
            int endIndex = Integer.parseInt(st.nextToken());

            myReverseArray(bucketArray, startIndex - 1, endIndex -1);
        }
        for(int i = 0; i < bucketArray.length; i++){
            bw.write(bucketArray[i] + " ");
        }
        bw.write("\n");
        bw.close();
    }
    public static void  myReverseArray(int[] array, int startIndex, int endIndex){
        for(int i = startIndex; i < (startIndex + endIndex + 2)/2; i++){
            int temp = array[i];
            array[i] = array[endIndex + startIndex - i];
            array[endIndex + startIndex - i] = temp;
        }

    }
}
