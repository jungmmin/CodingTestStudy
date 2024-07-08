package 백준_알고리즘별.dynamic_programming;

import java.util.Scanner;

public class B1_1110 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N;
        int result = 0;
        if(N < 10 && N > 0){
            temp = N * 10 + N;
            result++;
        }
        do{
            int n1 = temp%10 * 10;
            int n2 = (temp/10 + temp%10)%10;
            temp = n1 + n2;
            result++;
        }while (N != temp);

        System.out.println(result);
    }
}
