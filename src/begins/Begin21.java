package begins;

import java.util.Scanner;

public class Begin21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1,x2,x3,y1,y2,y3;

        System.out.print("x1=");
        x1 = scanner.nextDouble();

        System.out.print("y1=");
        y1 = scanner.nextDouble();

        System.out.print("x2=");
        x2= scanner.nextDouble();

        System.out.print("y2=");
        y2 = scanner.nextDouble();

        System.out.print("x3=");
        x3 = scanner.nextDouble();

        System.out.print("y3=");
        y3= scanner.nextDouble();

        double result = Math.sqrt(Math.pow((x1 - y1),2) + Math.pow((x2 - y2),2) + Math.pow((x3 - y3),2));
        System.out.println("Nuqtalar orasidagi masofa = " + result);

        double a,b,c,S,p;

        System.out.print("a=");
        a = scanner.nextDouble();

        System.out.print("b=");
        b = scanner.nextDouble();

        System.out.print("c=");
        c = scanner.nextDouble();

        p = (a + b + c) / 2;

        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Perimetri= " + p);
        System.out.println("Yuzi= " + S);
    }
}
