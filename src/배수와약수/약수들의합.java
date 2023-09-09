package 배수와약수;

import java.io.*;

public class 약수들의합 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;
        int sum = 0;




        while(true){
            sb = new StringBuilder();
            sum = 0;

            int number = Integer.parseInt(br.readLine());

            if(number == -1){
                break;
            }
            sb.append(number).append(" = ");
            for(int i = 1; i <= number/2; i++){
                if(number % i == 0){
                    sb.append(i);
                    sum += i;
                    if(i<number/2){
                        sb.append(" + ");
                    }
                }
            }
            sb.append("\n");

            if(number != sum){
                sb = new StringBuilder(number + " is NOT perfect.\n");
            }
            bw.write(sb.toString());
        }
        bw.close();
    }
}
