package 코딩테스트대비.Section6_SortingandSearching;

import java.io.*;
import java.util.StringTokenizer;

public class P2_버블정렬 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int x : array) {
            sb.append(x).append(" ");
        }

        bw.write(String.valueOf(sb));
        bw.close();
    }
}
