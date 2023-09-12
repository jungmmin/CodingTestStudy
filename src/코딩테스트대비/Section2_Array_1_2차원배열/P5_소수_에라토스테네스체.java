package 코딩테스트대비.Section2_Array_1_2차원배열;

import java.io.*;

public class P5_소수_에라토스테네스체 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] sosu = new boolean[200001];
        makeSosu(sosu);

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 1; i <= N; i++){
            if(!sosu[i]){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
    public static void makeSosu(boolean[] array){
        array[0] = true;
        array[1] = true;

        for(int i = 2; i < array.length; i++){
            if(!array[i]){
                for(int j = i*2; j < array.length; j+=i){
                    array[j] = true;
                }
            }
        }

    }
}
