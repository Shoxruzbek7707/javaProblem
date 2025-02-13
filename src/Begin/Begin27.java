package Begin;

import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A;
        System.out.print("A=");
        A = scanner.nextDouble();

        System.out.println("A**2 = " + Math.pow(A,2));
        System.out.println("A**4 = " + Math.pow(A,4));
        System.out.println("A**3 = " + Math.pow(A,3));
    }
}
