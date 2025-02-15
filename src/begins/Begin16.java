package begins;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double X1,X2;
        System.out.print("X1=");
        X1 = scanner.nextDouble();
        System.out.print("X2=");
        X2 = scanner.nextDouble();
        System.out.println("Result: " + Math.abs(X1-X2));
    }
}
