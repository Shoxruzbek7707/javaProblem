package fors;

import java.util.Scanner;

public class For36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        System.out.print("k=");
        int k = scanner.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++){
            sum += Math.pow(i,k);
        }
        System.out.println(sum);
    }
}
