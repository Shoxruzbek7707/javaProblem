package funcs;

import java.util.Scanner;

public class Func14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K;
        System.out.print("K=");
        K = scanner.nextInt();

        System.out.println(DigiCount(K));
    }
    static  int DigiCount(int K){
        int count = 0;
        while (K > 0){
            count ++;
            K /= 10;
        }
        return count;
    }
}
