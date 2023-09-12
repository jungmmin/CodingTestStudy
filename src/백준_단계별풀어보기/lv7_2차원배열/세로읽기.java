package 백준_단계별풀어보기.lv7_2차원배열;

/**
 * https://www.acmicpc.net/problem/10798
 * 한 줄의 단어는 글자들을 빈칸 없이 연속으로 나열해서 최대 15개의 글자들로 이루어진다. 또한 만들어진 다섯 개의 단어들의 글자 개수는 서로 다를 수 있다.
 *
 * 심심해진 영석이는 칠판에 만들어진 다섯 개의 단어를 세로로 읽으려 한다. 세로로 읽을 때, 각 단어의 첫 번째 글자들을 위에서 아래로 세로로 읽는다. 다음에 두 번째 글자들을 세로로 읽는다. 이런 식으로 왼쪽에서 오른쪽으로 한 자리씩 이동 하면서 동일한 자리의 글자들을 세로로 읽어 나간다. 위의 그림 1의 다섯 번째 자리를 보면 두 번째 줄의 다섯 번째 자리의 글자는 없다. 이런 경우처럼 세로로 읽을 때 해당 자리의 글자가 없으면, 읽지 않고 그 다음 글자를 계속 읽는다. 그림 1의 다섯 번째 자리를 세로로 읽으면 D1gk로 읽는다.
 *
 * 그림 1에서 영석이가 세로로 읽은 순서대로 글자들을 공백 없이 출력하면 다음과 같다:
 *
 * Aa0aPAf985Bz1EhCz2W3D1gkD6x
 *
 * 칠판에 붙여진 단어들이 주어질 때, 영석이가 세로로 읽은 순서대로 글자들을 출력하는 프로그램을 작성하시오.
 */

import java.io.*;
public class 세로읽기 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        char[][] cArray = new char[5][15];

        for(int i = 0; i < cArray.length; i++){
            char[] line = br.readLine().toCharArray();
            for(int j = 0; j < line.length; j++){
                cArray[i][j] = line[j];
            }
        }

        for(int i = 0; i < cArray[0].length; i++){
            for(int j = 0; j < cArray.length; j++){
                if(cArray[j][i] != '\u0000'){
                    sb.append(cArray[j][i]);
                }
            }
        }

        bw.write(sb.toString());
        bw.close();

    }
}
