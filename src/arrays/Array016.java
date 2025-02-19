package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[n];

        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }

        System.out.println("Natija:");
        for (int i = 0;i < (n +1) / 2;i++){
            System.out.print(array[i] + " ");
            if (i != n - i - 1){
                System.out.print(array[n - i -1] + " ");
            }
        }
    }
}
