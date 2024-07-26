package 백준_알고리즘별.greedy;

import java.io.*;
import java.util.Stack;

public class B1_1373 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            stack.push(Integer.parseInt(String.valueOf(c)));
        }

        while (!stack.isEmpty()) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                if (!stack.isEmpty() && stack.pop() == 1) {
                    sum += (int)Math.pow(2, i);
                }
            }
            sb.insert(0, sum);
        }

        bw.write(String.valueOf(sb));
        bw.close();
    }
}
