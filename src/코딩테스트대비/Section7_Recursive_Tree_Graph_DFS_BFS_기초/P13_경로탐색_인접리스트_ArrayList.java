package 코딩테스트대비.Section7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.*;
import java.util.*;

public class P13_경로탐색_인접리스트_ArrayList {
    static int n,m;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;
    static int answer;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ch = new int[n+1];
        graph = new ArrayList<ArrayList<Integer>>();
        answer = 0;

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        ch[1] = 1;
        DFS(1);

        bw.write(Integer.toString(answer));
        bw.close();

    }
    static void DFS(int v) {
        if(v == n){
            answer++;
        }else{
            for(int nv : graph.get(v)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }
}
