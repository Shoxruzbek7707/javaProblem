package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,L,K;
        System.out.print("n=");
        n = scanner.nextInt();

        System.out.print("K=");
        K = scanner.nextInt();

        System.out.print("L=");
        L = scanner.nextInt();

        if (0 <= K && K <= L && L < n){
            int[] array = new int[n];

            Random random = new Random();

            System.out.println("Massivdagi elementlar:");
            for (int i = 0;i < n;i++){
                array[i] = random.nextInt(10);
                System.out.print(array[i] + " ");
            }

            int sumElement = 0;
            for (int i = K; i <= L;i++){
                sumElement += array[i];
            }
            System.out.println("K dan L gacha elementlar yig'indisi: " + sumElement);
        }

    }
}
