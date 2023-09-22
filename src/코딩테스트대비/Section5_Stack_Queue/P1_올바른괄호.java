package 코딩테스트대비.Section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1_올바른괄호 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        String answer = "YES";

        char[] array = br.readLine().toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(') {
                stack.push(1);
            }else{
                if(stack.isEmpty()){
                    answer = "NO";
                }else{
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            answer = "NO";
        }

        System.out.println(answer);
    }
}
