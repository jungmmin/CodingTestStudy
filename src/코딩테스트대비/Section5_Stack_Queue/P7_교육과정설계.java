package 코딩테스트대비.Section5_Stack_Queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class P7_교육과정설계 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] required = br.readLine().toCharArray();
        Queue<Character> queue = new LinkedList<>();
        char[] subject = br.readLine().toCharArray();
        String answer = "YES";

        for(char x : required){
            queue.offer(x);
        }

        for (char x : subject) {
            if(queue.contains(x)){
                if(queue.peek() == x){
                    queue.poll();
                    if(queue.isEmpty()){
                        break;
                    }
                }else{
                    answer = "NO";
                    break;
                }
            }
        }
        if(!queue.isEmpty()){
            answer = "NO";
        }

        System.out.println(answer);
    }
}
