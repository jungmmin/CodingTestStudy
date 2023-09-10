package 코딩테스트대비.Section2_Array_1_2차원배열;

import java.io.*;

public class P1_큰수출력하기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] numberArray = br.readLine().split(" ");

        sb.append(numberArray[0]);
        for(int i = 1; i < numberArray.length; i++){
            if(Integer.parseInt(numberArray[i]) > Integer.parseInt(numberArray[i-1])){
                sb.append(" ").append(numberArray[i]);
            }
        }
        System.out.println(sb);

    }
}
