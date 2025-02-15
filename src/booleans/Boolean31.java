package booleans;

import java.util.Scanner;

public class Boolean31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("c=");
        c = scanner.nextInt();

        boolean result = (a == b || b == c || a == c);

        System.out.print(result);


    }
}
