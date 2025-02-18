package funcs;

import java.util.Scanner;

public class Func05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,h;
        System.out.print("a=");
        a = scanner.nextDouble();

        System.out.print("b=");
        h = scanner.nextDouble();

        double result = Triangle(a,h);
        System.out.println(result);
    }
    public static double Triangle(double a,double h){
        double b = Math.sqrt((a / 2) * (a / 2) + h * h);
        return 2 * b + a;
    }
}
