package 코딩테스트대비.Section3_TwoPointers_SlidingWindow;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 두배열합치기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int nArray[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nArray[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int mArray[] = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            mArray[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if(nArray[p1] < mArray[p2]){
                answer.add(nArray[p1++]);
            }else{
                answer.add(mArray[p2++]);
            }
        }
        while(p1<n){
            answer.add(nArray[p1++]);
        }
        while(p2<m){
            answer.add(mArray[p2++]);
        }

        for (int number : answer) {
            bw.write(Integer.toString(number) + " ");
        }
        bw.close();

    }

}
