package begins;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double L,R,S;
        System.out.print("L=");
        L = scanner.nextDouble();
        R = L / (Math.PI * 2);
        S = Math.PI * Math.pow(R,2);
        System.out.println("Radiusi: " + R);
        System.out.println("Yuzasi: " + S);

    }
}
