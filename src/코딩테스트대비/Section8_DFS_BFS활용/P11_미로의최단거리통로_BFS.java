package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.*;

public class P11_미로의최단거리통로_BFS {
    static int n = 7, answer = -1;
    static int[][] board = new int[n][n];
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        BFS();
        System.out.println(answer);


    }
    public static class XY{
        int x;
        int y;
        int dis;
        public XY(int x, int y, int dis){
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }
    public static void BFS(){
        Queue<XY> q = new LinkedList<>();

        q.offer(new XY(0,0, 0));
        board[0][0] = 1;
        while(!q.isEmpty()){
            XY xy = q.poll();

            // 도착 여부
            if(xy.x == n-1 && xy.y == n-1){
                if(answer != -1){
                    answer = Math.min(xy.dis, answer);
                }else{
                    answer = xy.dis;
                }

            }

            // 12, 3, 6, 9시 방향 q에 넣기
            for (int i = 0; i < dx.length; i++) {
                int nx = xy.x + dx[i];
                int ny = xy.y + dy[i];

                if(nx > -1 && nx < n && ny > -1 && ny < n && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    q.offer(new XY(nx, ny, xy.dis+1));
                }
            }
        }
    }
}
