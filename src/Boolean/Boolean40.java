package Boolean;

import java.util.Scanner;

public class Boolean40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, y1, x2, y2;

        System.out.print("x1=");
        x1 = scanner.nextInt();

        System.out.print("y1=");
        y1 = scanner.nextInt();

        System.out.print("x2=");
        x2 = scanner.nextInt();

        System.out.print("y2=");
        y2 = scanner.nextInt();

        boolean result = (Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1) || (Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2);
        System.out.print(result);


    }
}
