package If;

import java.util.Scanner;

public class If24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x ni kiriting: ");
        double x = scanner.nextDouble();
        double f;

        if (x > 0) {
            f = 2 * Math.sin(x);
        } else {
            f = x - 6;
        }

        System.out.println("f(x) = " + f);
    }
}
