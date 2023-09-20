package 코딩테스트대비.Section4_HashMap_TreeSet;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P3_매출액의종류_Hash_slidingWindow {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int[] array = new int[n];
        int k = Integer.parseInt(st.nextToken());

        int lt = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < k-1; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        for (int rt = k-1; rt < n; rt++) {
            map.put(array[rt], map.getOrDefault(array[rt], 0) + 1);
            sb.append(map.size()).append(" ");

            map.put(array[lt], map.get(array[lt]) - 1);
            if(map.get(array[lt]) == 0){
                map.remove(array[lt]);
            }
            lt++;
        }

        bw.write(String.valueOf(sb));
        bw.close();


    }
}
