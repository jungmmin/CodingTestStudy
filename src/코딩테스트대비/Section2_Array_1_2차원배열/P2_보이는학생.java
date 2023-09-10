package 코딩테스트대비.Section2_Array_1_2차원배열;

import java.io.*;
import java.util.StringTokenizer;

public class P2_보이는학생 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int maxHeight = 0;
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            int height = Integer.parseInt(st.nextToken());

            if (height > maxHeight) {
                maxHeight = height;
                cnt++;
            }
        }

        System.out.println(cnt);
    }

}
