package 코딩테스트대비.Section2_Array_1_2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3_가위바위보 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        for(int i = 0; i < N; i++){
            if(A[i].equals(B[i])){
                sb.append("D").append("\n");
            }
            else if(A[i].equals("1")){
                if(B[i].equals("2")){
                    sb.append("B").append("\n");
                }else{
                    sb.append("A").append("\n");
                }
            }else if(A[i].equals("2")){
                if(B[i].equals("1")){
                    sb.append("A").append("\n");
                }else{
                    sb.append("B").append("\n");
                }
            }else if(A[i].equals("3")){
                if(B[i].equals("1")){
                    sb.append("B").append("\n");
                }else{
                    sb.append("A").append("\n");
                }
            }
        }
        System.out.println(sb);

    }
}
