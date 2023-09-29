package 코딩테스트대비.Section6_SortingandSearching;

import java.io.*;
import java.util.*;
public class P7_좌표정렬 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Point> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Point(x, y));
        }

        Collections.sort(list);
        for(Point o : list){
            System.out.println(o.x + " " + o.y);
        }
    }

}
class Point implements Comparable<Point>{

    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        if(this.x == o.x){
            return this.y - o.y;
        }else{
            return this.x - o.x;
        }
    }
}
