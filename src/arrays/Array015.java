package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[n];

        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(10);
        }

        System.out.println("Array elementlari:");
        for (int i = 0;i < n;i++){
            System.out.print(array[i] + " ");
        }

        System.out.println("Natijasi:");
        for (int i = 0;i < n;i += 2){
            System.out.print(array[i] + " ");
        }

        for (int i = n - 1; i >= 0;i -= 2){
            System.out.print(array[i] + " ");
        }

    }
}
