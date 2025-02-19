package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        int[] array = new int[n];

        Random random = new Random();

        int count = 0;
        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(20);
        }

        for (int i = 0;i < n;i++){
            if (array[i] % 2 == 1){
                System.out.print(array[i] + " ");
                count++;
            }
        }
        System.out.println("Toqlar soni: " + count);
    }
}
