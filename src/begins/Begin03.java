package begins;

import java.util.Scanner;

public class Begin03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double S,P,a,b;
        System.out.print("a=");
        a = scanner.nextDouble();
        System.out.print("b=");
        b = scanner.nextDouble();
        S = a * b;
        P = 2 * (a + b);
        System.out.println("Yuzasi: " + S);
        System.out.print("Perimetri: " + P);



    }
}
