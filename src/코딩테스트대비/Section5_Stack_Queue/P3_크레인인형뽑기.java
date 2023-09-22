package 코딩테스트대비.Section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class P3_크레인인형뽑기 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer>[] boardStack = new LinkedList[n];
        Stack<Integer> pointStack = new Stack<>();
        StringTokenizer st;
        int answer = 0;

        // 스택 초기화
        for (int i = 0; i < boardStack.length; i++) {
            boardStack[i] = new LinkedList<>();
        }

        // 게임 보드 채우기 Stack nxn 크기
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                int dollNumber = Integer.valueOf(st.nextToken());
                if(dollNumber != 0){
                    boardStack[j].offer(dollNumber);
                }
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // 크레인이 뽑고 옆에 놓는 과정
        for (int i = 0; i < m; i++) {
            int lineNumber = Integer.parseInt(st.nextToken()) - 1;
            int dollNumber = 0;

            // 크레인이 인형을 뽑았을 때
            if(!boardStack[lineNumber].isEmpty()){
                dollNumber = boardStack[lineNumber].poll();

                // 포인트 스택에 마지막값이 뽑은 인형이랑 같을 때
                if(!pointStack.isEmpty() && dollNumber == pointStack.peek()){
                    pointStack.pop();
                    answer += 2;
                }else{
                    pointStack.push(dollNumber);
                }
            }
        }
        System.out.println(answer);
    }
}
