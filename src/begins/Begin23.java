package begins;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a,b,c;

        System.out.print("a=");
        a = scanner.nextDouble();

        System.out.print("b=");
        b = scanner.nextDouble();

        System.out.print("c=");
        c = scanner.nextDouble();

        double temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("Yangilangan qiymatlar");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
    }
}
