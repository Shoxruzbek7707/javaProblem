package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n= ");
        n = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[n];

        System.out.println("Massiv elementlari:");

        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }

        int[] maxElementsIndex = new int[n];

        int index = 0;
        for (int i = 0;i < n -1;i++){
            if (array[i] > array[i + 1]){
                maxElementsIndex[index ++] = i;
            }
        }

        System.out.println("Max elements");
        int[] result = Arrays.copyOf(maxElementsIndex,index);
        Arrays.sort(result);

        for (int num:result){
            System.out.print(num + " ");
        }
        System.out.println("Soni : " + index);
    }
}
