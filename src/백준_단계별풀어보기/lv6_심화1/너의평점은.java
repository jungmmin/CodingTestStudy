package 백준_단계별풀어보기.lv6_심화1;

/**
 * https://www.acmicpc.net/problem/25206
 * 인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!
 *
 * 치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
 *
 * 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
 */
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 너의평점은 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double gradeSum = 0;
        double pointSum = 0;

        Map<String, Double> gradePointHashMap = new HashMap<>();
        gradePointHashMap.put("A+", 4.5);
        gradePointHashMap.put("A0", 4.0);
        gradePointHashMap.put("B+", 3.5);
        gradePointHashMap.put("B0", 3.0);
        gradePointHashMap.put("C+", 2.5);
        gradePointHashMap.put("C0", 2.0);
        gradePointHashMap.put("D+", 1.5);
        gradePointHashMap.put("D0", 1.0);
        gradePointHashMap.put("F", 0.);
        gradePointHashMap.put("P", 0.);

        for(int i = 0; i < 20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            String g1 = st.nextToken();
            String g2 = st.nextToken();

            if(!g2.equals("P")){
                double grade1 = Double.valueOf(g1);
                double grade2 = Double.valueOf(gradePointHashMap.get(g2));

                gradeSum += grade1;
                pointSum += grade1 * grade2;
            }

        }

        bw.write(String.format("%.6f", pointSum / gradeSum));
        bw.close();
    }

}
