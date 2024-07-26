package 백준_알고리즘별.greedy;

import java.io.*;

public class B1_1032 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] sArray = new String[n];

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            sArray[i] = s;
        }

        // 첫번째 문자열 가져오기
        char[] s1 = sArray[0].toCharArray();

        // 첫번째 문자열과 나머지 문자열의 문자를 각각 비교
        for (int i = 0; i < s1.length; i++) {
            for (int j = 1; j < sArray.length; j++) {
                // 나머지 문자열중 현재 위치의 문자가 첫번재 문자열과 일치 하지 않으면 현재 문자 ?로 바꾸고 break
                if(s1[i] != sArray[j].charAt(i)) {
                    s1[i] = '?';
                    break;
                }
            }
        }

        bw.write(s1);
        bw.close();


    }

}
