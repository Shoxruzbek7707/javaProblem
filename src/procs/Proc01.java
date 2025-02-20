package procs;

import java.util.Scanner;

public class Proc01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A;
        System.out.print("A=");
        A = scanner.nextDouble();
        double result = powerA3(A);
        System.out.println(result);

    }
     static double powerA3(double A){
        return Math.pow(A,3);
    }
}
