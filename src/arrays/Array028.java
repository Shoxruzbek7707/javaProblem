package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n= ");
        n = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[n];

        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(20);
        }

        System.out.println("Massiv elementlari:");
        for (int i = 0;i < n;i++){
            System.out.print(array[i] + " ");
        }

        int min = array[0];

        for (int i = 0;i < n;i += 2){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Eng kichik element-> " + min);
    }
}
