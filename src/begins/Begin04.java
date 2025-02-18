package begins;

import java.util.Scanner;

public class Begin04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double L,d,p=3.14;
        System.out.println("d=");
        d = scanner.nextDouble();
        L = p * d;
        System.out.print("Diametri: " + L);

    }
}
