package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.*;

public class P13_섬나라아일랜드_BFS {
    static int n;
    static int[][] board;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        int answer = 0;

        // 보드 생성
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //보드 순회 중 섬 발견시 answer++ 및 해당 섬 지우기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1){
                    answer++;
                    BFS(new Point(i, j));
                }
            }
        }

        System.out.println(answer);

    }
    public static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void BFS(Point p) {
        Queue<Point> q = new LinkedList<>();
        q.offer(p);
        while (!q.isEmpty()) {
            Point point = q.poll();
            for (int i = 0; i < dx.length; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if(nx > -1 && nx < n && ny > -1 && ny < n && board[nx][ny] == 1){
                    board[nx][ny] = 0;
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }
}
