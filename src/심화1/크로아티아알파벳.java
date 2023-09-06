package 심화1;

import java.io.*;

public class 크로아티아알파벳 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] cArray = {"dz=", "c=","c-", "d-", "lj", "nj", "s=", "z=", };

        String s = br.readLine();

        for(String checkString : cArray){
            while(s.contains(checkString)){
                s = s.replace(checkString, " ");
            }
        }

        bw.write(Integer.toString(s.length()));
        bw.close();

    }

}
