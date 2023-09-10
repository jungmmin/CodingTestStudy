package 코딩테스트대비.Section1_String_문자열;

import java.io.*;

public class P5_특정문자뒤집기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] s = br.readLine().toCharArray();
        int startIndex = 0;
        int endIndex = s.length - 1;

        while (startIndex < endIndex) {
            if (Character.isLetter(s[startIndex]) && Character.isLetter(s[endIndex])) {
                char temp = s[startIndex];
                s[startIndex] = s[endIndex];
                s[endIndex] = temp;
                startIndex++;
                endIndex--;
            } else if (Character.isLetter(s[startIndex])) {
                endIndex--;
            } else {
                startIndex++;
            }
        }

        bw.write(s);
        bw.close();
    }

}
