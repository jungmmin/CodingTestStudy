package 코딩테스트대비.Section5_Stack_Queue;

import java.io.*;
import java.util.Stack;

public class P5_쇠막대기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] s = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean check = false;
        int answer = 0;

        for (char x : s) {
            if (x == '(') {
                stack.push(x);
                check = true;
            }else if (x == ')' && check) {
                stack.pop();
                answer += stack.size();
                check = false;
            }else{
                stack.pop();
                answer++;
                check = false;
            }
        }

        System.out.println(answer);
    }
}
