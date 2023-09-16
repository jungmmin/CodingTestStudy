package 코딩테스트대비.Section3_TwoPointers_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3_최대매출 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int sum = 0, maxSum = 0;

        int[] nArray = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            nArray[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < k; i++) {
            sum += nArray[i];
        }

        maxSum = sum;
        for(int i = k; i < n; i++){
            sum += nArray[i] - nArray[i - k];
            if(sum > maxSum){
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}
