package arrays;

import java.util.Scanner;

public class Array006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A,B,n;
        System.out.print("n=");
        n = scanner.nextInt();

        System.out.print("A=");
        A = scanner.nextInt();

        System.out.print("B=");
        B = scanner.nextInt();

        if (n <= 2){
            System.out.println("n > 2 bo'lishi kerak!");
            return;
        }

        int[] array = new int[n];

        array[0] = A;
        array[1] = B;

        for (int i = 2; i < n; i++){
            array[i] = array[i - 1] + array[i - 2];
        }

        for (int num:array){
            System.out.print(num + " ");
        }
    }
}
