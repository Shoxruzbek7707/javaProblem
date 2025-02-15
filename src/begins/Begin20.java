package begins;

import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1,x2,y1,y2;
        System.out.print("x1=");
        x1 = scanner.nextDouble();
        System.out.print("y1=");
        y1 = scanner.nextDouble();
        System.out.print("x2=");
        x2 = scanner.nextDouble();
        System.out.print("y2=");
        y2 = scanner.nextDouble();

        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Ikki nuqta orasidagi nuqta: " + result);

    }
}
