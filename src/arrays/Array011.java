package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,K;
        System.out.print("n=");
        n = scanner.nextInt();

        System.out.print("K=");
        K = scanner.nextInt();

        if (1 <= K && K < n){
            int[] array = new int[n];
            Random random = new Random();

            for (int i = 0;i < n;i++){
                array[i] = random.nextInt(10);
            }

            for (int i = 0;i < n;i += K){
                System.out.print(array[i] + " ");
            }
        }else{
            System.out.println("1 <= K < n bo'lishi kerak!");
        }

    }
}
