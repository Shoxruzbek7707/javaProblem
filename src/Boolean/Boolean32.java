package Boolean;

import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("c=");
        c = scanner.nextInt();

        boolean result = (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) ;

        System.out.print(result);


    }
}
