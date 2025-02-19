package arrays;

import java.util.Scanner;

public class Array005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        if (n <= 1){
            System.out.println("n > 1  bo'lishi kerak!");
            return;
        }
        int F1 = 1;
        int F0 = 0;

        int[] fibonacci = new int[n];
        fibonacci[0] = F0;
        fibonacci[1] = F1;

        for (int i = 2;i < n;i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int num:fibonacci){
            System.out.print(num + " ");
        }
    }
}
