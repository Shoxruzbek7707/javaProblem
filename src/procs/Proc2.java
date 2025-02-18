package procs;

import java.util.Scanner;

public class Proc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A,B = 0,C = 0,D = 0;

        System.out.print("A=");
        A = scanner.nextDouble();

        powerA234(A,B,C,D);

    }
    public static void powerA234(double A, double B, double C,double D){
        B = Math.pow(A,2);
        C = Math.pow(A,3);
        D = Math.pow(A,4);
        System.out.println("A ** 2 = " + B);
        System.out.println("A ** 3 = " + C);
        System.out.println("A ** 4 = " + D);
    }
}
