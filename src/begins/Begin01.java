package begins;

import java.util.Scanner;

public class Begin01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p,a;
        System.out.print("a=");
        a = scanner.nextDouble();
        p = 4 * a;
        System.out.println("Perimetri " + p);
    }
}
