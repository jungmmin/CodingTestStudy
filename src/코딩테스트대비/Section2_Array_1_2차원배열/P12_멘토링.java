package 코딩테스트대비.Section2_Array_1_2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P12_멘토링 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int student = Integer.parseInt(st.nextToken());
        int test = Integer.parseInt(st.nextToken());
        int answer = 0;

        int[][] array = new int[test][student];
        boolean[] cntArray = new boolean[student];

        for(int i = 0; i < array.length; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        for(int i = 0; i < student; i++){
            Arrays.fill(cntArray, false);

            for (int j = 0; j < test; j++) {
                for(int k = 0; k < student; k++){
                    cntArray[array[j][k] - 1] = true;
                    if(array[j][k] - 1 == i){
                        break;
                    }
                }
            }

            for(int l = 0; l < student; l++){
                if(!cntArray[l]){
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }
}
