package 코딩테스트대비.Section1_String_문자열;

import java.io.*;

public class P1_문자찾기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        String input = br.readLine().toUpperCase();
        char findChar =Character.toUpperCase(br.readLine().charAt(0));

        for(int i = 0; i < input.length(); i++){
           char checkChar = input.charAt(i);
            if(findChar == checkChar){
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.close();

    }
}
