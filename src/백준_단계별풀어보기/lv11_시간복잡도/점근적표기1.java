package 백준_단계별풀어보기.lv11_시간복잡도;

import java.io.*;
import java.util.StringTokenizer;

public class 점근적표기1 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if(a1 * n0 + a0 <= n0 * c && a1 <= c){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
