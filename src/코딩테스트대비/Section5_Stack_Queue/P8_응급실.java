package 코딩테스트대비.Section5_Stack_Queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P8_응급실 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Person> queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 환자 리스트 생성
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int priority = Integer.parseInt(st.nextToken());
            queue.offer(new Person(i, priority));
        }

        int answer = 1;
        Person temp = null;
        while (!queue.isEmpty()) {
            temp = queue.poll();

            for (Person x : queue) {
                if (x.priority > temp.priority) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if (temp != null) {
                if (temp.id == m) {
                    break;
                }else{
                    answer++;
                }
            }
        }
        System.out.println(answer);

    }
    public static class Person{
        int id;
        int priority;

        public Person(int id, int priority){
            this.id = id;
            this.priority = priority;
        }
    }
}
