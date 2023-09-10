package 코딩테스트대비.Section1_String_문자열;

import java.io.*;
import java.util.StringTokenizer;

public class P3_문장속단어 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String longestword = "";
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            String word = st.nextToken();
            if(longestword.length() < word.length()){
                longestword = word;
            }
        }

        bw.write(longestword);
        bw.close();
    }
}
