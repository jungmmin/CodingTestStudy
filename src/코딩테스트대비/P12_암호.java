package 코딩테스트대비;

import java.io.*;

public class P12_암호 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;
        StringBuilder result = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();

        for(int i = 0; i < N*7; i+=7){
            sb = new StringBuilder();
            for(int j = i; j < i+7; j++){
                if(s[j] == '#'){
                    sb.append(1);
                }else{
                    sb.append(0);
                }
            }
            result.append((char)Integer.parseInt(sb.toString(), 2));
        }

        bw.write(result.toString());
        bw.close();

    }
}
