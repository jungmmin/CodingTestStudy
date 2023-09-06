package 코딩테스트대비;

import java.io.*;

public class P7_회문문자열 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] s = br.readLine().toUpperCase().toCharArray();

        int start = 0;
        int end = s.length - 1;
        String check = "YES";

        while(start < end){
            if(s[start++] != s[end--]){
                check = "NO";
                break;
            }

        }

        bw.write(check);
        bw.close();


    }
}
