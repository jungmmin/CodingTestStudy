package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.*;

public class P12_토마토_BFS {
    static int n,m;
    static int[][] board;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 1){
                    q.offer(new Point(i, j, 0));
                }
            }
        }

        System.out.println(BFS(q));

    }
    public static int BFS(Queue<Point> q){
        int answer = 0;

        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if(nx > -1 && nx < n && ny > -1 && ny < m && board[nx][ny] == 0){
                    q.offer(new Point(nx, ny, p.day + 1));
                    board[nx][ny] = 1;
                }
            }
            answer = p.day;
        }
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                if(board[i][j] == 0){
                    answer = -1;
                }
            }
        }
        return answer;
    }

    public static class Point{
        int x;
        int y;
        int day;

        public Point(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }

    }
}
