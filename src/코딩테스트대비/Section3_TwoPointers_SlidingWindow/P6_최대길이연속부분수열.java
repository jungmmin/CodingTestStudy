package 코딩테스트대비.Section3_TwoPointers_SlidingWindow;

import java.io.*;
import java.util.StringTokenizer;

public class P6_최대길이연속부분수열 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] array = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0, changedZeroCnt = 0, lt = 0;


        for (int rt = 0; rt < n; rt++) {
            if(array[rt] == 0){
                changedZeroCnt++;
            }

            if(changedZeroCnt > k){
                while(changedZeroCnt > k){
                    if(array[lt] == 0){
                        changedZeroCnt--;
                    }
                    lt++;
                }
            }
            int length = rt - lt + 1;
            if(length > result){
                result = length;
            }

        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
