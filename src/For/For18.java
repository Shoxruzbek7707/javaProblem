package For;

import java.util.Scanner;
public class For18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("a = ");
        double a = scanner.nextDouble();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(a, i) * Math.pow(-1, i);
        }
        System.out.println("Sum = " + sum);
    }
}
