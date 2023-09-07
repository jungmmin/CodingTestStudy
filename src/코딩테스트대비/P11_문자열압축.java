package 코딩테스트대비;

import java.io.*;

public class P11_문자열압축 {
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int count = 1;
        char prev = 0;

        for(int i = 0; i < s.length(); i++){
            if(prev == s.charAt(i)){
                count++;
            }else if(count > 1){
                sb.append(Integer.toString(count));
                sb.append(s.charAt(i));
                count = 1;
            }else{
                sb.append(s.charAt(i));
            }

            if(i == s.length() - 1 && count > 1){
                sb.append(count);
            }

            prev = s.charAt(i);
        }

        bw.write(sb.toString());
        bw.close();

    }
}
