package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,k,l;
        System.out.print("n= ");
        n = scanner.nextInt();

        System.out.print("k= ");
        k = scanner.nextInt();

        System.out.print("l= ");
        l = scanner.nextInt();

        Random random = new Random();

        if (0 <= k && k <= l && l < n){
            int[] array = new int[n];

            for (int i = 0;i < n;i++){
                array[i] =  random.nextInt(1,10);
            }


            int sum = 0;
            for (int i = 0; i < array.length;i++){
                if (i < k || l < i){
                    sum += array[i];
                }

            }

            System.out.println("Yig'indi: " + sum);
        }
    }
}
