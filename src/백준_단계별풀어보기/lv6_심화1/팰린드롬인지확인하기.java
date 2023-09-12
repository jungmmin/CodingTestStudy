package 백준_단계별풀어보기.lv6_심화1;

import java.io.*;

public class 팰린드롬인지확인하기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        int equal = 1;
        int start = 0;
        int end = S.length() - 1;

        while(start < end){
            if(S.charAt(start++) != S.charAt(end--)){
                equal = 0;
                break;
            }
        }

        bw.write(Integer.toString(equal));
        bw.close();

    }
}
