package 심화1;

import java.io.*;
public class 새싹 {
    public static void main(String args[]) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = "         ,r\'\"7\n"
                + "r`-_   ,\'  ,/\n"
                + " \\. \". L_r\'\n"
                + "   `~\\/\n"
                + "      |\n"
                + "      |\n";

        bw.write(S);
        bw.close();

    }
}
