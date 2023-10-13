package 코딩테스트대비.Section9_GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P7_원더랜드_프림 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
        int[] ch = new int[v+1];
        ArrayList<ArrayList<Edge>> list = new ArrayList<>();
        int answer = 0;

        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<Edge>());
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.get(v1).add(new Edge(v2, cost));
            list.get(v2).add(new Edge(v1, cost));
        }

        pq.offer(new Edge(1, 0));
        while(!pq.isEmpty()){
            Edge edge = pq.poll();

            if(ch[edge.vex] == 0){
                ch[edge.vex] = 1;
                answer += edge.cost;

                for(Edge ob : list.get(edge.vex)){
                    if (ch[ob.vex] == 0) {
                        pq.offer(ob);
                    }
                }

            }


        }
        System.out.println(answer);

    }
    public static class Edge implements Comparable<Edge>{
        int vex;
        int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e) {
            return this.cost - e.cost;
        }
    }
}
