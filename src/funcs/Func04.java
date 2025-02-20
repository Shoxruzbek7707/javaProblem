package funcs;

import java.util.Scanner;

public class Func04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double R1,R2;
        System.out.print("R1=");
        R1 = scanner.nextDouble();

        System.out.print("R2=");
        R2 = scanner.nextDouble();

        double result = Rings(R1,R2);
        System.out.println(result);
    }

    static double Rings(double R1, double R2){
        return 3.14 * (R1 * R1 - R2 * R2);
    }
}
