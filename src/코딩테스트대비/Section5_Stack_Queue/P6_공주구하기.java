package 코딩테스트대비.Section5_Stack_Queue;

import java.io.*;
import java.util.*;

public class P6_공주구하기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int cnt = 0;
        int temp = 0;
        while(queue.size() > 1){
            temp = queue.poll();
            cnt++;
            if(cnt < k){
                queue.offer(temp);
            }else{
                cnt = 0;
            }
        }

        bw.write(Integer.toString(queue.poll()));
        bw.close();


    }
}
