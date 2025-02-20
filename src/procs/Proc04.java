package procs;

import java.util.Scanner;

public class Proc04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,P = 0, S = 0;

        System.out.print("a=");
        a = scanner.nextDouble();

        uchburchakPS(a,P,S);
    }

   static void uchburchakPS(double a, double P, double S){
         P = a *3;
         S = (Math.pow(a,2) * Math.sqrt(3)) / 4;
         System.out.println("Perimetri: " + P);
         System.out.println("Yuzi: " + S);

    }
}
