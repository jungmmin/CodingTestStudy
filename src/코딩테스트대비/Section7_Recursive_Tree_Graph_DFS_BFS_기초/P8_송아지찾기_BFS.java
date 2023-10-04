package 코딩테스트대비.Section7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.*;
import java.util.*;
public class P8_송아지찾기_BFS {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        System.out.println(BFS(s, e));


    }
    public static int BFS(int s, int e) {
        int[] dis = {1, -1, 5};
        int[] ch;
        Queue<Integer> q = new LinkedList<>();

        ch = new int[10001];
        ch[s] = 1;

        q.offer(s);
        int level = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int x = q.poll();
                if(x == e){
                    return level;
                }
                for (int j = 0; j < dis.length; j++) {
                    int nx = x + dis[j];
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
