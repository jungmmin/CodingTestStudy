package 코딩테스트대비.Section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P2_괄호문자제거 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] array = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if(array[i] == '('){
                stack.push(1);
            }else if(array[i] == ')'){
                stack.pop();
            }
            else if(stack.isEmpty()){
                sb.append(array[i]);
            }

        }
        System.out.println(sb);
    }
}
