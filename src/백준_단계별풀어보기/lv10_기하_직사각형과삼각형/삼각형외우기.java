package 백준_단계별풀어보기.lv10_기하_직사각형과삼각형;

/**
 * https://www.acmicpc.net/problem/10101
 * 창영이는 삼각형의 종류를 잘 구분하지 못한다. 따라서 프로그램을 이용해 이를 외우려고 한다.
 *
 * 삼각형의 세 각을 입력받은 다음,
 *
 * 세 각의 크기가 모두 60이면, Equilateral
 * 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
 * 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
 * 세 각의 합이 180이 아닌 경우에는 Error
 * 를 출력하는 프로그램을 작성하시오.
 */

//* hashset을 이용해 같은 각이 있는지 확인하는 것도 좋을거 같음
import java.io.*;

public class 삼각형외우기 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] angleArray = new int[3];
        int sum = 0;
        int angle60Cnt = 0;

        for(int i = 0; i < angleArray.length; i++){
            angleArray[i] = Integer.parseInt(br.readLine());
            sum += angleArray[i];
            if(angleArray[i] == 60) angle60Cnt++;
        }
        if(angle60Cnt == angleArray.length){
            System.out.println("Equilateral");
        }
        else if(sum == 180) {
            if(checkAngle(angleArray)){
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }
        }
        else{
            System.out.println("Error");
        }



    }
    public static boolean checkAngle(int[] array){

        for (int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    return true;
                }
            }
        }

        return false;
    }
}
