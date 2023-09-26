package 코딩테스트대비.Section6_SortingandSearching;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P6_장난꾸러기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] tmp = array.clone();

        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) {
            if (array[i] != tmp[i]) {
                sb.append(i+1).append(" ");
            }
        }

        System.out.println(sb);

    }
}
