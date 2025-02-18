package begins;

import java.util.Scanner;

public class Begin08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double G,a,b;
        System.out.print("a=");
        a = scanner.nextDouble();
        System.out.print("b=");
        b = scanner.nextDouble();
        G = Math.sqrt(a*b);
        System.out.print("Geometrigi: " + G);
    }
}
