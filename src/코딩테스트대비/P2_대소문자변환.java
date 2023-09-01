package 코딩테스트대비;

import java.io.*;

public class P2_대소문자변환 {
    public static void main(String args[]) throws IOException {

        // a = 97 A = 65

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if((int)c < (int)'a'){
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(Character.toUpperCase(c));
            }
        }

        bw.write(String.valueOf(sb));
        bw.close();
    }
}
