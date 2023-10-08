package 코딩테스트대비.Section8_DFS_BFS활용;

import java.io.*;
import java.util.StringTokenizer;

public class P6_순열구하기 {
    static int n, m;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] array = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] ch = new int[n];
        int[] pm = new int[m];
        DFS(0, ch, pm, array);

    }

    public static void DFS(int l, int[] ch, int[] pm, int[] array) {
        if(l == m){
            for (int i = 0; i < pm.length; i++) {
                System.out.print(pm[i] + " ");
            }
            System.out.println();
        }else{
            for (int i = 0; i < ch.length; i++) {
                if(ch[i] == 0){
                    pm[l] = array[i];
                    ch[i] = 1;
                    DFS(l+1, ch, pm, array);
                    ch[i] = 0;
                }
            }
        }
    }
}
