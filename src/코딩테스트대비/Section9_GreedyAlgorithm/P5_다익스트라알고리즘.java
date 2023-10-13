package 코딩테스트대비.Section9_GreedyAlgorithm;

import java.io.*;
import java.util.*;

public class P5_다익스트라알고리즘 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        int[] dis = new int[n+1];
        PriorityQueue<Edge> pq = new PriorityQueue<>();

        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.get(start).add(new Edge(end, cost));
        }

        pq.offer(new Edge(1, 0));
        dis[1] = 0;
        while (!pq.isEmpty()) {
            Edge nowEdge = pq.poll();

            if(nowEdge.cost > dis[nowEdge.vex]){
                continue;
            }
            for(Edge e : graph.get(nowEdge.vex)){
                if(dis[e.vex] > e.cost + nowEdge.cost){
                    dis[e.vex] = e.cost + nowEdge.cost;
                }
                pq.offer(new Edge(e.vex, nowEdge.cost + e.cost));
            }
        }

        for (int i = 1; i < dis.length; i++) {
            System.out.println(i + "까지 거리 : " +  dis[i]);
        }

    }

    public static class Edge implements Comparable<Edge>{
        int vex;
        int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e){
            return this.cost - e.cost;
        }

    }
}
