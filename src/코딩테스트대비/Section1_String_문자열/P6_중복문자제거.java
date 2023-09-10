package 코딩테스트대비.Section1_String_문자열;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class P6_중복문자제거 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        Set<Character> linkedHashSet = new LinkedHashSet<>();
        String s = br.readLine();

       for(char c : s.toCharArray()){
           linkedHashSet.add(c);
       }
       for(char c : linkedHashSet){
           sb.append(c);
       }

       bw.write(sb.toString());
       bw.close();

    }
}
