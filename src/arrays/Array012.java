package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        if (n % 2 == 1){
            System.out.println("n ga juft son kiriting:");
            return;
        }

        Random random = new Random();
        int[] array = new int[n];

        for (int i = 0; i < n;i++){
            array[i] = random.nextInt(10);
        }

        for (int i = 0;i < n;i += 2){
            System.out.print(array[i] + " ");
        }
    }
}
