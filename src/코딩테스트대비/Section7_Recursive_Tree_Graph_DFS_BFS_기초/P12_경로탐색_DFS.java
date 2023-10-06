package 코딩테스트대비.Section7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.*;
import java.util.*;

public class P12_경로탐색_DFS {
    static int[][] array;
    static int[] ch;
    static int answer = 0;
    static int n;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        array = new int[n+1][n+1];
        ch = new int[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            array[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        }

        ch[1]= 1;
        DFS(1);
        System.out.println(answer);

    }
    static void DFS(int v){
        if(v == n){
            answer++;
        }else{
            for (int i = 1; i <= n; i++) {
                if(array[v][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

}
