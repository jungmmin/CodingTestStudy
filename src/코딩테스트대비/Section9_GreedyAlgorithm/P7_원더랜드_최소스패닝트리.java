package 코딩테스트대비.Section9_GreedyAlgorithm;

import java.io.*;
import java.util.*;
public class P7_원더랜드_최소스패닝트리 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int answer = 0;

        int[] setArray = new int[v+1];
        for (int i = 1; i <= v; i++) {
            setArray[i] = i;
        }

        Edge[] edgeArray = new Edge[e];
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            edgeArray[i] = new Edge(v1, v2, cost);
        }
        Arrays.sort(edgeArray);

        for (Edge edge : edgeArray) {
            if(find(setArray, edge.v1) != find(setArray, edge.v2)){
                union(setArray, edge.v1, edge.v2);
                answer += edge.cost;
            }
        }

        System.out.println(answer);

    }

    public static void union(int[] setArray, int v1, int v2) {
        int fV1 = find(setArray, v1);
        int fV2 = find(setArray, v2);
        if(fV1 != fV2){
            setArray[fV1] = fV2;
        }

    }

    public static int find(int[] setArray, int v) {
        if(v == setArray[v]){
            return setArray[v];
        }else{
            return setArray[v] = find(setArray, setArray[v]);
        }
    }
    public static class Edge implements Comparable<Edge>{
        int v1;
        int v2;
        int cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e) {
            return this.cost - e.cost;
        }

    }
}
