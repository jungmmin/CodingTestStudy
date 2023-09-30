package 코딩테스트대비.Section7_Recursive_Tree_Graph_DFS_BFS_기초;

public class P3_팩토리얼 {
    public static void main(String args[]) {
        System.out.println(DFS(5));
    }

    public static int DFS(int n) {
        if(n == 1) return 1;
        else return n*DFS(n-1);
    }
}
