package ifs;

import java.util.Scanner;

public class If25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x ni kiriting: ");
        double x = scanner.nextDouble();
        double f;

        if (x < -2 || x > 2) {
            f = 2 * x;
        } else {
            f = -3 * x;
        }

        System.out.println("f(x) = " + f);

    }
}
