package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.*;

public class P13_섬나라아일랜드_DFS {
    static int n;
    static int[][] board;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < n; j++) {
                if(board[i][j] == 1){
                    answer++;
                    DFS(new Point(i, j));
                }
            }
        }
        System.out.println(answer);

    }
    public static void DFS(Point p){
        for (int i = 0; i < dx.length; i++) {
            int nx = p.x + dx[i];
            int ny = p.y + dy[i];

            if(nx > -1 && nx < n && ny > -1 && ny < n && board[nx][ny] == 1){
                board[nx][ny] = 0;
                DFS(new Point(nx, ny));
            }
        }
    }
    public static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
