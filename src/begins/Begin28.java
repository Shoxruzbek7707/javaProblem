package begins;

import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A;
        System.out.print("A=");
        A = scanner.nextDouble();

        System.out.println("A**2 = " + Math.pow(A,2));
        System.out.println("A**3 = " + Math.pow(A,3));
        System.out.println("A**5 = " + Math.pow(A,5));
        System.out.println("A**10 = " + Math.pow(A,10));
        System.out.println("A**15 = " + Math.pow(A,15));
    }
}
