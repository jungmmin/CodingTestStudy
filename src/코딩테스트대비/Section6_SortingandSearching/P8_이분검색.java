package 코딩테스트대비.Section6_SortingandSearching;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P8_이분검색 {
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

        Arrays.sort(array);

        int lt = 0;
        int rt = array.length - 1;
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if (array[mid] == m) {
                answer = mid + 1;
                break;
            }else if(array[mid] > m){
                rt = mid - 1;
            }else{
                lt = mid + 1;
            }
        }

        System.out.println(answer);

    }
}
