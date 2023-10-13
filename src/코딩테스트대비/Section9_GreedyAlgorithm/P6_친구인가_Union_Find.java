package 코딩테스트대비.Section9_GreedyAlgorithm;

import java.io.*;
import java.util.*;

public class P6_친구인가_Union_Find {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] setArray = new int[n+1];
        for (int i = 1; i <= n; i++) {
            setArray[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            int friend = Integer.parseInt(st.nextToken());

            int findS = find(setArray, student);
            int findF = find(setArray, friend);

            union(setArray, findS, findF);

        }

        st = new StringTokenizer(br.readLine());
        int cF1 = Integer.parseInt(st.nextToken());
        int cF2 = Integer.parseInt(st.nextToken());

        if(find(setArray, cF1) == find(setArray, cF2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }

    public static int find(int[] setArray, int number) {
        if(number == setArray[number]){
            return setArray[number];
        }else{
            return setArray[number] = find(setArray, setArray[number]);
        }
    }

    public static void union(int[] setArray, int student, int friend) {
        if (setArray[student] != setArray[friend]) {
            setArray[student] = setArray[friend];
        }
    }
}
