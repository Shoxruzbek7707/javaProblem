package arrays;

import java.util.Scanner;

public class Array001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        int[] array = new int[n];

        int toqNumber = 1;
        for (int i = 0;i < n;i++){
            array[i] = toqNumber;
            toqNumber += 2;
            System.out.print(array[i] + " ");
        }
    }
}
