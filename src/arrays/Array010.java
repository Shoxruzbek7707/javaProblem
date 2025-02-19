package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        int[] array = new int[n];

        Random random = new Random();

        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(20);
        }

        for (int i = 0;i < n;i++){
            if (array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }

        for (int i = n - 1;i >= 0;i--){
            if (array[i] % 2 == 1){
                System.out.print(array[i] + " ");
            }
        }
    }
}
