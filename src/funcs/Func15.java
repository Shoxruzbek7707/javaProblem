package funcs;

import java.util.Scanner;

public class Func15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K,N;
        System.out.print("K=");
        K = scanner.nextInt();

        System.out.print("N=");
        N = scanner.nextInt();

        System.out.println(DigitN(K,N));
    }
    static int DigitN(int K,int N){
        int lenght = 0,temp = K;
        while(temp > 0){
            lenght ++;
            temp /= 10;
        }
        if (N > lenght){
            return -1;
        }
        for (int i = 1;i < N;i++){
            K /= 10;
        }
        return K % 10;
    }
}
