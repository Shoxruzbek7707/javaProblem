package arrays;

import java.util.Scanner;

public class Array004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,A,D;
        System.out.print("n=");
        n = scanner.nextInt();

        System.out.print("A=");
        A = scanner.nextInt();

        System.out.print("D=");
        D = scanner.nextInt();

        int[] array = new int[n];
        array[0] = A;
        for (int i = 1;i < n;i++){
            array[i] = array[i - 1] * D;
        }

        for (int num : array){
            System.out.print(num + " ");
        }
    }
}
