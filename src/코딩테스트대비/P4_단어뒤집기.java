package 코딩테스트대비;

import java.io.*;

public class P4_단어뒤집기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0){
            StringBuilder sb = new StringBuilder();
            char[] s = br.readLine().toCharArray();
            for(int i = s.length - 1; i >= 0; i--){
                sb.append(s[i]);
            }
            bw.write(sb.toString());
            bw.write("\n");
        }
        bw.close();

    }
}
