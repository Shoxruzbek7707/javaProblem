package fors;

import java.util.Scanner;
public class For24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("x = ");
        double x = scanner.nextDouble();

        double sum = 1;
        double term = 1;
        for (int i = 1; i < n; i++) {
            term *= -x * x / ((2 * i - 1) * (2 * i));
            sum += term;
        }
        System.out.println("cos(x) ≈ " + sum);
    }
}
