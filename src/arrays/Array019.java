package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[n];

        System.out.println("Massiv elementlari:");
        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }

        int firstElement = array[0];
        int lastElement = array[n-1];

        boolean lompochka = false;
        for (int i = n - 1; i >= 0;i--){
            if (firstElement < array[i] && array[i] < lastElement){
                System.out.println("Result ->" + array[i]);
                lompochka = true;
                break;
            }
        }

        if(!lompochka){
            System.out.println(0);
        }
    }
}
