package fors;

import java.util.Scanner;

public class For30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();

        System.out.print("a=");
        double a = scanner.nextDouble();

        System.out.print("b=");
        double b = scanner.nextDouble();

        double qadam =  (b - a) / n;
        for (int i = 0;i <= n;i++){
            double x = a + i * qadam;
            System.out.println("f(" + x +") = " + (1 - Math.sin(x)));
        }

    }
}
