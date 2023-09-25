package 코딩테스트대비.Section6_SortingandSearching;

import java.io.*;
import java.util.StringTokenizer;

public class P3_삽입정렬 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < array.length; i++) {
            int j, temp = array[i];
            for (j = i - 1; j >= 0; j--) {
                if(array[j] > temp){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = temp;
        }

        for(int i = 0; i < n; i++){
            bw.write(array[i] + " ");
        }
        bw.close();
    }
}
