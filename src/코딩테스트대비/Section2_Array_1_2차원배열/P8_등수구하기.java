package 코딩테스트대비.Section2_Array_1_2차원배열;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class P8_등수구하기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] nArray = br.readLine().split(" ");
        int[] rank = new int[N];

        for(int i = 0; i < nArray.length; i++){
            for(int j = i; j < nArray.length; j++){
                if (Integer.parseInt(nArray[i]) > Integer.parseInt(nArray[j])) {
                    rank[j]++;
                }else if(Integer.parseInt(nArray[i]) < Integer.parseInt(nArray[j])){
                    rank[i]++;
                }
            }
        }

        for(int i = 0; i < rank.length; i++){
            System.out.print((rank[i] + 1)+ " ");
        }
    }
}
