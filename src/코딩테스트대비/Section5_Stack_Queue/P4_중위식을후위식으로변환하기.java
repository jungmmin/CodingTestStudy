package 코딩테스트대비.Section5_Stack_Queue;

import java.io.*;
import java.util.*;

public class P4_중위식을후위식으로변환하기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] array = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char x : array) {
            switch (x) {
                case '+':
                case '-':
                case '*':
                case '/':
                    while(!stack.isEmpty() && priority(x) <= priority(stack.peek())){
                        sb.append(stack.pop());
                    }
                    stack.add(x);
                    break;
                case '(':
                    stack.add(x);
                    break;
                case ')':
                    while(stack.peek() != '('){
                        sb.append(stack.pop());
                    }
                    stack.pop();
                    break;
                // 숫자일 때
                default:
                    sb.append(x);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }

    public static int priority(char x) {

        switch(x){
            case '+':
            case '-':
                return 0;
            case '*':
            case '/':
                return 1;
            default:
                return -1;
        }
    }
}
