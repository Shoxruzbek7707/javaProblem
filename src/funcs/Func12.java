package funcs;

import java.util.Scanner;

public class Func12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K,N;
        System.out.print("K=");
        K = scanner.nextInt();

        System.out.print("N=");
        N = scanner.nextInt();

        System.out.println(IsPowerN(K,N));
    }
    static boolean IsPowerN(int K,int N){
        while (K > 1){
            if (K % N !=0){
                return false;
            }
            K /= N;
        }
        return K == 1;
    }
}
