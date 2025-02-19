package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[n];

        System.out.println("Array elementalari:");
        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }

        int lampochka = 0;
        for (int i = 0; i < n-2;i++){
            if(array[n - 1] > array[i]){
                System.out.println("Birinchi element:" + array[i]);
                lampochka = 1;
                break;
            }
        }

        if (lampochka == 0){
            System.out.println("Bunday element yo'q!");
        }
    }
}
