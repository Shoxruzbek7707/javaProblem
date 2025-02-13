package Boolean;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        System.out.print("x=");
        x = scanner.nextInt();

        System.out.print("y=");
        y = scanner.nextInt();

        boolean result = (x + y) % 2 == 0 ;

        System.out.print(result);
    }
}
