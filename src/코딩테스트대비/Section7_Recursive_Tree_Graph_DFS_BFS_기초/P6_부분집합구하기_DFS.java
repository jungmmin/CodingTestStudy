package 코딩테스트대비.Section7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.*;

public class P6_부분집합구하기_DFS {
    static int n;
    static int[] ch;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        ch = new int[n+1];
        DFS(1);

    }
    public static void DFS(int l){
        if (l == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 1){
                    tmp += i + " ";
                }
            }
            if(tmp.length() > 0){
                System.out.println(tmp);
            }
        }else{
            ch[l] = 1;
            DFS(l+1);
            ch[l] = 0;
            DFS(l+1);
        }
    }
}
