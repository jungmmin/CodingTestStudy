package 심화1;

import java.io.*;

public class 단어공부 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[26];
        int maxFreq = 0;
        char maxFreqAlpabet = 0;
        Boolean duplicate = false;

        char[] sArray = br.readLine().toCharArray();

        for(int cNum : sArray){
            array[Character.toUpperCase(cNum) - 'A']++;
        }

        for(int i = 0; i < array.length; i++){
            if(maxFreq == array[i]){
                duplicate = true;
            }
            if(maxFreq < array[i]){
                maxFreq = array[i];
                maxFreqAlpabet = (char) ('A' + i);
                duplicate = false;
            }
        }

        if(duplicate){
            bw.write("?");
        }else{
            bw.write(maxFreqAlpabet);
        }
        bw.close();
    }
}
