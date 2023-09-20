package 코딩테스트대비.Section4_HashMap_TreeSet;

import java.io.*;
import java.util.HashMap;

public class P1_학급회장_HashMap {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] array = br.readLine().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        char answer = ' ';

        for (char x : array) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = 0;
        for (char x : map.keySet()) {
            //System.out.println("x = " + x + " value = " + map.get(x));
            if(max < map.get(x)){
                max = map.get(x);
                answer = x;
            }
        }

        bw.write(answer);
        bw.close();

    }
}
