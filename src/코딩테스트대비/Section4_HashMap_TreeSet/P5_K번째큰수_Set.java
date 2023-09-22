package 코딩테스트대비.Section4_HashMap_TreeSet;

import java.io.*;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class P5_K번째큰수_Set {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int grade = Integer.parseInt(st.nextToken());
        int[] array = new int[n];
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < array.length - 2; i++){
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    set.add(array[i] + array[j] + array[k]);
                }
            }
        }

        if(grade < set.size()){
            System.out.println(set.toArray(new Integer[0])[grade-1]);
        }else{
            System.out.println(-1);
        }


    }
}
