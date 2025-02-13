package Boolean;

import java.util.Scanner;

public class Boolean9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        if (a % 2 == 1 ||  b % 2 == 1 ){
            System.out.print(true);
        }else {
            System.out.print(false);
        }
    }
}
