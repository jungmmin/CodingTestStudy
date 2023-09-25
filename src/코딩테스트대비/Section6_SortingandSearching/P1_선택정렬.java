package 코딩테스트대비.Section6_SortingandSearching;

import java.io.*;
import java.util.StringTokenizer;
public class P1_선택정렬 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < array.length; i++) {
            int idx = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[idx] > array[j]){
                    idx = j;
                }
            }
            int temp = array[i];
            array[i] = array[idx];
            array[idx] = temp;
        }

        for (int x : array) {
            sb.append(x + " ");
        }

        bw.write(String.valueOf(sb));
        bw.close();

    }
}
