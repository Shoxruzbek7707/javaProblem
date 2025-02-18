package procs;

import java.util.Scanner;

public class Proc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K;
        System.out.print("K=");
        K = scanner.nextInt();
        int result = reversedNum(K);
        System.out.println(result);

    }
    public static int reversedNum(int K){
        int reversedNum = 0;
        while (K > 0){
            reversedNum = reversedNum * 10 + K % 10;
            K /= 10;
        }
        return reversedNum;
    }
}
