package arrays;

import java.util.Scanner;

public class Array002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        int[] array = new int[n];

        int two = 2;
        for (int i = 0;i < n;i++){
            array[i] = (int) Math.pow(two,i);
            System.out.print(array[i] + " ");
        }
    }
}
