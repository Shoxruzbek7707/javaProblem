package booleans;

import java.util.Scanner;

public class Boolean06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("c=");
        c = scanner.nextInt();

        if (a <= b && b <= c){
            System.out.print(true);
        }else {
            System.out.print(false);
        }
    }
}
