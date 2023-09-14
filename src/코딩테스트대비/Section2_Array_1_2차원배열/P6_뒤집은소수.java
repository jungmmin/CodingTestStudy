package 코딩테스트대비.Section2_Array_1_2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6_뒤집은소수 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] sosu = new int[100001];
        makeSosu(sosu);

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(N-- > 0){
            int number = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));

            if(sosu[number] == 0){
                sb.append(Integer.toString(number)).append(" ");
            }
        }

        System.out.println(String.valueOf(sb).trim());





    }

    public static void makeSosu(int[] array){

        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            if(array[i] == 0){
                for(int j = i * 2; j < array.length; j+=i){
                    array[j] = 1;
                }
            }
        }
    }
}
