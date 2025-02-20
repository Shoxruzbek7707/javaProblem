package funcs;

import java.util.Scanner;

public class Func10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K;
        System.out.print("K=");
        K = scanner.nextInt();
        System.out.println(Isquare(K));

    }
    static boolean Isquare(int K){
        for (int i = 1; i * i <= K;i++){
            if (i * i == K){
                return true;
            }
        }
        return false;
    }
}
