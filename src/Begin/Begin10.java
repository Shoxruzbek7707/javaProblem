package Begin;

import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double K,Y,a,b;
        System.out.print("a=");
        a = scanner.nextDouble();
        System.out.print("b=");
        b = scanner.nextDouble();
        Y = a + b;
        K = a * b;
        System.out.println("Yig'indi: " + Y);
        System.out.println("Ko'paytma: " + K);
        System.out.println("Moduli a -> " + Math.pow(a,2));
        System.out.println("Moduli b -> " + Math.pow(b,2));
    }
}
