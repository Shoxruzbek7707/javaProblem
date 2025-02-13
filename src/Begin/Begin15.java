package Begin;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double S,d,R;
        System.out.println("S=");
        S = scanner.nextDouble();

        R = Math.sqrt(S/Math.PI);
        d = 2 * R;
        System.out.println("Radius: " + R);
        System.out.println("Diametri: " + d);
    }
}
