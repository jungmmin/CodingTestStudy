package 코딩테스트대비.Section6_SortingandSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P4_LeastRecentlyUsed_stack버전 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        Stack<Integer> cache = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int nowNumber = Integer.parseInt(st.nextToken());

            if(cache.contains(nowNumber)){
                cache.remove(cache.indexOf(nowNumber));
            }
            cache.push(nowNumber);
            if(cache.size() > s){
                cache.remove(0);
            }
        }
        while (!cache.isEmpty()) {
            System.out.print(cache.pop() + " ");
        }

    }
}
