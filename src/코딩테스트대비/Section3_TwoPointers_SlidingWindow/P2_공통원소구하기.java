package 코딩테스트대비.Section3_TwoPointers_SlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2_공통원소구하기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] aArray = new int[n];
        int p1 = 0, p2 = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            aArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(aArray);

        int m = Integer.parseInt(br.readLine());
        int[] bArray = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            bArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(bArray);

        while(p1 < n && p2 < m){
            if(aArray[p1] == bArray[p2]){
                arrayList.add(aArray[p1]);
                p1++;
                p2++;
            }else if(aArray[p1] > bArray[p2]){
                p2++;
            }else{
                p1++;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
