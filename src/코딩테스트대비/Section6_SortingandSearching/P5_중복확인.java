package 코딩테스트대비.Section6_SortingandSearching;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P5_중복확인 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(Integer.valueOf(st.nextToken()));
        }

        if (n == set.size()) {
            System.out.print("U");
        }else{
            System.out.print("D");
        }
    }
}
