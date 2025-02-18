package funcs;

import java.util.Scanner;

public class Func02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A,B,C;
        System.out.print("A=");
        A = scanner.nextDouble();

        System.out.print("B=");
        B = scanner.nextDouble();

        System.out.print("C=");
        C = scanner.nextDouble();

        int result = RootCount(A,B,C);
        System.out.println(result);
    }
    public static int RootCount(double A,double B,double C){
        double D = B * B - 4 * A * C;
        if(D > 0){
            return 2;
        }else if(D == 0){
            return 1;
        }else{
            return 0;
        }
    }
}
