package 코딩테스트대비.Section2_Array_1_2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.*;

public class P9_격자판최대합 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = parseInt(br.readLine());

        int rowSum = 0, coloumSum = 0, leftDownSum = 0, rightDownSum = 0, maxSum = 0;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                array[i][j] = parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++){
            rowSum = 0;
            coloumSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += array[i][j];
                coloumSum += array[j][i];

                if (i == j) {
                    leftDownSum += array[i][j];
                }
                if(i + j == n - 1){
                    rightDownSum += array[i][j];
                }
            }
            maxSum = max(maxSum, max(rowSum, coloumSum));
        }
        maxSum =max(maxSum, max(leftDownSum, rightDownSum));
        System.out.println(maxSum);


    }
}
