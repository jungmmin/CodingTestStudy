package 심화1;

import java.io.*;

public class 그룹단어체커 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Boolean check = true;
        int count = 0;

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0){
            String word = br.readLine();
            if(groupWordChecker(word)){
                count++;
            }
        }

        bw.write(Integer.toString(count));
        bw.close();

    }

    public static Boolean groupWordChecker(String s){
        boolean[] alphabetArray = new boolean[26];
        int prevAlphabet = 0;

        for(int i = 0; i < s.length(); i++){
            int nowAlphabet = s.charAt(i);

            if(prevAlphabet != nowAlphabet){
                if(alphabetArray[nowAlphabet - 'a'] == false){
                    alphabetArray[nowAlphabet - 'a'] = true;
                }else{
                    return false;
                }
            }
            prevAlphabet = nowAlphabet;
        }

        return true;
    }
}
