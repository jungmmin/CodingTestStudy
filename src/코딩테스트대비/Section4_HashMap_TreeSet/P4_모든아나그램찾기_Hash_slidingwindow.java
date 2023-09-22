package 코딩테스트대비.Section4_HashMap_TreeSet;

import java.io.*;
import java.util.HashMap;

public class P4_모든아나그램찾기_Hash_slidingwindow {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] s = br.readLine().toCharArray();
        char[] t = br.readLine().toCharArray();

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        int answer = 0;

        for(int i = 0; i < t.length - 1; i++){
            sMap.put(s[i], sMap.getOrDefault(s[i], 0) +1);
        }
        for (int i = 0; i < t.length; i++) {
            tMap.put(t[i], tMap.getOrDefault(t[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = t.length - 1; rt < s.length; rt++) {
            sMap.put(s[rt], sMap.getOrDefault(s[rt], 0) + 1);

            boolean check = true;
            for (char x : sMap.keySet()) {
//                System.out.println("sMap " + x + " = " + sMap.get(x) + "tMap " + x + " = " + tMap.get(x));
                if (sMap.get(x) != tMap.get(x)) {
                    check = false;
                    break;
                }
            }
//            System.out.println();
            if (check) {
                answer++;
            }

            if(sMap.get(s[lt]) - 1 != 0){
                sMap.put(s[lt], sMap.get(s[lt]) - 1);
            }else{
                sMap.remove(s[lt]);
            }
            lt++;
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}
