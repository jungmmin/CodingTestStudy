package 코딩테스트대비.Section1_String_문자열;

import java.io.*;

public class P8_유효한펠린드롬 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] s = br.readLine().toUpperCase().toCharArray();
        String check = "YES";

        int start = 0;
        int end = s.length - 1;

        while(start < end){
            char startC = s[start];
            char endC = s[end];

            if(!Character.isLetter(startC)){
                start++;
            }if(!Character.isLetter(endC)){
                end--;
            }
            if(Character.isLetter(startC) && Character.isLetter(endC) && startC != endC){
                check = "NO";
                break;
            }else if(Character.isLetter(startC) && Character.isLetter(endC) && startC == endC){
                start++;
                end--;
            }

        }

        bw.write(check);
        bw.close();
    }
}
