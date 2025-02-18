package begins;

import java.util.Scanner;

public class Begin07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double R,S,L,p=3.14;
        System.out.print("R=");
        R = scanner.nextDouble();
        L = 2 * p * R;
        S = p * Math.pow(R,2);
        System.out.println("Uzunligi: " + L);
        System.out.print("Yuzasi: " + S);
    }
}
