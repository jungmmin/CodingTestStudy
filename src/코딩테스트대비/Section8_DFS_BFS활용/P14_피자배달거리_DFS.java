package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.*;

public class P14_피자배달거리_DFS {
    static int n, m;
    static int answer = Integer.MAX_VALUE;
    static ArrayList<Point> hs;
    static ArrayList<Point> pz;
    static int[] combi;

    public static class Point{
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        combi = new int[m];

        hs = new ArrayList<>();
        pz = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int nb = Integer.parseInt(st.nextToken());
                if(nb == 1){
                    hs.add(new Point(i, j));
                } else if (nb == 2) {
                    pz.add(new Point(i, j));
                }
            }
        }
        DFS(0, 0);
        System.out.println(answer);

    }
    public static void DFS(int l, int s){
        if(l == m){
            int sum = 0;
            for(Point p : hs){
                int dis = Integer.MAX_VALUE;
                for(int i : combi) {
                    dis = Math.min(dis, Math.abs(p.x - pz.get(i).x) + Math.abs(p.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }else{
            for(int i = s; i < pz.size(); i++){
                combi[l] = i;
                DFS(l+1, i+1);
            }
        }
    }
}
