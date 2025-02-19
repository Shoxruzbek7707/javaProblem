package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array017 {
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

        System.out.println("Arraydagi sonlar:");
        for (int num:array){
            System.out.print(num + " ");
        }

        int left = 0,right = n - 1;
        System.out.println("Natija:");
        while (left <= right){
            System.out.print(array[left++] + " ");

            System.out.print(array[right--] + " ");

        }
    }
}
