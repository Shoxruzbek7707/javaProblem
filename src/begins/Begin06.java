package begins;

import java.util.Scanner;

public class Begin06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double V,S,a,b,c;
        System.out.print("a=");
        a = scanner.nextDouble();
        System.out.print("b=");
        b = scanner.nextDouble();
        System.out.print("c=");
        c = scanner.nextDouble();
        V = a * b * c;
        S = 2 * (a * b + b * c + a * c);
        System.out.println("Hajmi: " + V);
        System.out.print("To'la sirti: " + S);
    }
}
