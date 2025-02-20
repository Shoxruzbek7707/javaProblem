package procs;

import java.util.Scanner;

public class Proc05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1,x2,y1,y2,P = 0,S = 0;

        System.out.print("x1=");
        x1 = scanner.nextDouble();

        System.out.print("y1=");
        y1 = scanner.nextDouble();

        System.out.print("x2=");
        x2 = scanner.nextDouble();

        System.out.print("y2=");
        y2 = scanner.nextDouble();

        tortburchakPS(x1,y1,x2,y2,P,S);
    }
     static void tortburchakPS(double x1, double y1, double x2, double y2, double P, double S) {
        P = 2 * (Math.abs(x2 - x1) + Math.abs(y2 - y1));
        S = Math.abs(x2 - x1) * Math.abs(y2 - y1);
        System.out.println("To'rtburchak perimetri: " + P);
        System.out.println("To'rtburchak yuzi: " + S);
    }
}
