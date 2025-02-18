package funcs;

import java.util.Scanner;

public class Func09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K;
        System.out.println("K=");
        K = scanner.nextInt();
        System.out.println(Even(K));
    }
    public static boolean Even(int K){
        return K % 2 == 0;
    }
}
