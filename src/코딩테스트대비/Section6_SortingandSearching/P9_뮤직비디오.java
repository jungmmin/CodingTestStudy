package 코딩테스트대비.Section6_SortingandSearching;

import java.io.*;
import java.util.*;

public class P9_뮤직비디오 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = 0;
        int[] array = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        int lt = Arrays.stream(array).max().getAsInt();
        int rt = Arrays.stream(array).sum();

        while(lt <= rt){
            int mid = (lt + rt) / 2;

            if(m >= checkVideo(array, mid)){
                rt = mid - 1;
                answer = mid;
            }else{
                lt = mid + 1;
            }
        }

        System.out.println(answer);

    }

    public static int checkVideo(int[] array, int min) {
        int sum = 0;
        int cnt = 1;

        for(int x : array){
            if(sum + x > min){
                cnt++;
                sum = 0;
            }
            sum += x;
        }

        return cnt;
    }
}
