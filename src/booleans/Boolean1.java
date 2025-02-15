package booleans;

import java.util.Scanner;

public class Boolean1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A;

        System.out.print("A=");
        A = scanner.nextInt();

        boolean result = A >= 0;
        System.out.println(result);

    }
}
