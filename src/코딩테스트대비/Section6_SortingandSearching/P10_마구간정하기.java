package 코딩테스트대비.Section6_SortingandSearching;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class P10_마구간정하기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int answer = 0;

        int[] array = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int lt = 1;
        int rt = array[array.length - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
//            System.out.println("lt = " + lt + " rt = " + rt + " mid = " + mid);

            if(check(array, mid) < c){
                rt = mid - 1;
            }else{
                answer = mid;
                lt = mid + 1;
            }
        }

        System.out.println(answer);


    }
    public static int check(int[] array, int mid){

        int cnt = 1;
        int lastPos = array[0];
        for (int x : array) {
            if(x - lastPos >= mid){
                lastPos = x;
                cnt++;
            }
        }
        return cnt;
    }
}
