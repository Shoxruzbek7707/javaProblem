package begins;

import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.print("a=");
        a = scanner.nextDouble();
        System.out.print("b=");
        b = scanner.nextDouble();
        System.out.print("c=");
        c = scanner.nextDouble();

        double ac = Math.abs(c - a);
        double bc = Math.abs(c - b);

        System.out.println("AC * AB = " + (ac * bc));
    }
}
