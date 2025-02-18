package funcs;

import java.util.Scanner;

public class Func11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K;
        System.out.print("K=");
        K = scanner.nextInt();
        System.out.println(IsPower5(K));
    }
    public static boolean IsPower5(int K){
        while(K > 1){
            if (K % 5 != 0){
                return false;
            }
            K /= 5;
        }
        return  K == 1;
    }
}
