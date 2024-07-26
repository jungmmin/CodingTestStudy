package 백준_알고리즘별.greedy;

import java.io.*;

public class B1_11655 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] s = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char c : s) {
            if(Character.isLowerCase(c)) {
                if (c + 13 > 122) {
                    c -= 26;
                }
                sb.append((char)(c + 13));
            }else if(Character.isUpperCase(c)) {
                if (c + 13 > 90) {
                    c -= 26;
                }
                sb.append((char)(c + 13));
            }
            else{
                sb.append((char)c);
            }


        }

        bw.write(sb.toString());
        bw.close();

    }
}
