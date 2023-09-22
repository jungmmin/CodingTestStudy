package 코딩테스트대비.Section5_Stack_Queue;

import java.io.*;
import java.util.*;

public class P4_후위식연산_postfix {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        char[] array = br.readLine().toCharArray();
        for (char x : array) {
            if(Character.isDigit(x)){
                stack.push(Integer.parseInt(String.valueOf(x)));
            }else{
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(myCal(x, num2, num1));
            }
        }
        System.out.println(stack.pop());
    }
    public static int myCal(char x, int num1, int num2){
        if (x == '+') {
            return num1 + num2;
        }else if(x == '-'){
            return num1 - num2;
        }else if(x == '*'){
            return num1 * num2;
        }else{
            return num1 / num2;
        }
    }
}
