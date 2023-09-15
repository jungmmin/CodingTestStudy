package 코딩테스트대비.Section2_Array_1_2차원배열;

import java.io.*;
import java.util.StringTokenizer;

public class P11_임시반장정하기 {
    public static void main(String args[])throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] array = new int[5][n];
        int cnt;
        int maxCnt = 0;
        int answer = 0;

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < array[i].length; i++) {
            cnt = 0;
            for(int j = 0; j < array[j].length; j++){
                for (int k = 0; k < array.length; k++) {
                    if(array[i][k] == array[j][k]){
                        cnt++;
                        break;
                    }
                }
                if(maxCnt < cnt){
                    maxCnt = cnt;
                    answer = i + 1;
                }
            }
        }

        bw.write(Integer.toString(answer));
        bw.close();

    }
}
