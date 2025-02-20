package funcs;

import java.util.Scanner;

public class Func13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.print("N=");
        N = scanner.nextInt();

        System.out.println(IsPrime(N));
    }
    static boolean IsPrime(int N){
        if (N < 2){
            return false;
        }
        for(int i = 2;i * i <= N;i++){
            if (N % i == 0){
                return false;
            }
        }
        return true;
    }
}
