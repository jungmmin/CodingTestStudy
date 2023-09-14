package 코딩테스트대비.Section2_Array_1_2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7_점수계산 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int bonus = 1;
        int result = 0;

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        while(N-- > 0){
            int ox = Integer.parseInt(st.nextToken());
            if(ox == 1){
                result += bonus++;
            }else{
                bonus = 1;
            }
        }

        System.out.println(result);
    }
}
