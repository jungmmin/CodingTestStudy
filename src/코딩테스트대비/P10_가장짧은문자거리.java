package 코딩테스트대비;

import java.io.*;
import java.util.StringTokenizer;

public class P10_가장짧은문자거리 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] s = st.nextToken().toCharArray();
        char t = st.nextToken().charAt(0);

        int[] result = new int[s.length];

        int distance = -1;
        for(int i = 0; i < s.length; i++){

            if(s[i] == t){
                distance = 0;
            }else if(distance != -1){
                result[i] = distance++;
            }
            result[i] = distance;
        }

        distance = -1;
        for(int i = s.length - 1; i >= 0; i--){
            if(s[i] == t){
                distance = 1;
            }else if((distance != -1 && result[i] > distance) || result[i] == -1){
                result[i] = distance++;
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}
