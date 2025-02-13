package If;

import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min, max, a, b;

        System.out.print("a = ");
        a = scanner.nextInt();

        System.out.print("b = ");
        b = scanner.nextInt();

        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
