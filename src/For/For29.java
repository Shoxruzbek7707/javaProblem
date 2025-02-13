package For;

import java.util.Scanner;

public class For29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n, A, B ni kiriting: ");
        int n = scanner.nextInt();
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double step = (B - A) / n;
        for (int i = 0; i <= n; i++) {
            System.out.println(A + i * step);
        }
    }
}