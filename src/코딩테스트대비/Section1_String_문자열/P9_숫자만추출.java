package 코딩테스트대비.Section1_String_문자열;

import java.io.*;

public class P9_숫자만추출 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine().replaceAll("[^\\d]","");
        bw.write(Integer.parseInt(s));
        bw.close();
    }
}
