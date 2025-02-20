package funcs;

import java.util.Scanner;

public class Func07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b;
        int Op;

        System.out.print("a=");
        a = scanner.nextDouble();

        System.out.print("b=");
        b = scanner.nextDouble();

        System.out.print("opertsiyasni tanlang:");
        Op = scanner.nextInt();

        System.out.println(Calc(a,b,Op));

    }
    static double Calc(double a, double b,int Op) {
        if (Op == 1) return a - b;
        if (Op == 2) return a * b;
        if (Op == 3) return a / b;
        return a + b;
    }


}
