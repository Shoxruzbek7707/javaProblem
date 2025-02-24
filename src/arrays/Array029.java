package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n= ");
        n = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[n];

        System.out.println("Massiv elementlari:");
        for (int i = 0;i < n;i++){
            array[i] = random.nextInt();
            System.out.print(array[i] + " ");
        }

        int max = array[1];
        for (int i = 1;i < n;i += 2){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Eng katta element -> " + max);

    }
}
