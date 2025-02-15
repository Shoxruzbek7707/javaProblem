package booleans;

import java.util.Scanner;

public class Boolean12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("c=");
        c = scanner.nextInt();

        if (a > 0 || b > 0 || c > 0){
            System.out.print(true);
        }else {
            System.out.print(false);
        }
    }
}
