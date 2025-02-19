package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[n];

        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(20);
        }

        for (int i = n - 1; i >= 0;i--){
            System.out.print(array[i] + " ");
        }
    }
}
