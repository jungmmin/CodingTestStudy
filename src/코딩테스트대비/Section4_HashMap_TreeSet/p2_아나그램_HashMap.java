package 코딩테스트대비.Section4_HashMap_TreeSet;

import java.io.*;
import java.util.HashMap;

public class p2_아나그램_HashMap {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] array1 = br.readLine().toCharArray();
        char[] array2 = br.readLine().toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        String answer = "YES";

        for (int i = 0; i < array1.length; i++) {
            map1.put(array1[i], map1.getOrDefault(array1[i], 0) + 1);
            map2.put(array2[i], map2.getOrDefault(array2[i], 0) + 1);
        }

        for(char x : map1.keySet()){
            if(map1.get(x) != map2.get(x)){
//                System.out.println("map1.get("+ x +") = " + map1.get(x));
//                System.out.println("map2.get("+ x +") = " + map2.get(x));
                answer = "NO";
                break;
            }
        }

        bw.write(answer);
        bw.close();
    }
}
