package 백준_알고리즘별.greedy;

import java.io.*;

public class B1_1259 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String s = br.readLine();

            if(s.equals("0")){
                break;
            }
            StringBuilder sb = new StringBuilder(s);
            String s2 = String.valueOf(sb.reverse());

            if(s.equals(s2)){
                bw.write("yes\n");
            }else{
                bw.write("no\n");
            }
        }

        bw.close();
    }
}
