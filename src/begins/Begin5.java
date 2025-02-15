package begins;

import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double V,S,a;
        System.out.print("a=");
        a = scanner.nextDouble();
        V = Math.pow(a,3);
        S = 6 * Math.pow(a,2);
        System.out.println("Hajmi: " + V);
        System.out.print("To'la sirti: " + S);
    }
}
