package 백준_단계별풀어보기.lv5_문자열;

import java.io.*;

public class 다이얼 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int resultTime = 0;

        char[] charArray = br.readLine().toCharArray();

        for(char c : charArray){
            resultTime += myTimeCal(c);
        }

        bw.write(Integer.toString(resultTime));
        bw.close();
    }

    public static int myTimeCal(char c){
        int result = 0;
        if(c <= 'C'){
            result = 3;
        }else if (c <= 'F'){
            result = 4;
        }else if (c <= 'I'){
            result = 5;
        }else if (c <= 'L'){
            result = 6;
        }else if (c <= 'O'){
            result = 7;
        }else if (c <= 'S'){
            result = 8;
        }else if (c <= 'V'){
            result = 9;
        }else if (c <= 'Z'){
            result = 10;
        }
        return result;
    }
}
