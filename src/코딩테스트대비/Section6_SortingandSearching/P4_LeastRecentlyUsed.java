package 코딩테스트대비.Section6_SortingandSearching;

import java.io.*;
import java.util.StringTokenizer;

public class P4_LeastRecentlyUsed {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] cache = new int[s];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int nowNumber = Integer.parseInt(st.nextToken());

            // 뒤로 밀기 작업 시작해야하는 위치 찾기
            int startPos = getStartPos(cache, nowNumber);

            // 작업을 뒤로 다 미루기
            for(int j = startPos; j > 0; j--){
                cache[j] = cache[j-1];
            }

            cache[0] = nowNumber;
        }

        for (int i = 0; i < cache.length; i++) {
            System.out.print(cache[i] + " ");
        }

    }
    public static int getStartPos(int[] cache, int number){
        for (int i = 0; i < cache.length; i++) {
            if(cache[i] == number){
                return i;
            }
        }
        return cache.length - 1;
    }
}
