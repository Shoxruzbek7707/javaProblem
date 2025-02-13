package Boolean;

import java.util.Scanner;

public class Boolean11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        if ((a % 2 == 1 && b % 2 == 1) ||(a % 2 == 0 && b % 2 == 0) ){
            System.out.print(true);
        }else {
            System.out.print(false);
        }
    }
}
