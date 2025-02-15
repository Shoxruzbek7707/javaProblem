package fors;

import java.util.Scanner;
public class For33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n ni kiriting: ");
        int n = scanner.nextInt();
        int F1 = 1, F2 = 1;

        System.out.println("F1 = " + F1);
        System.out.println("F2 = " + F2);
        for (int k = 3; k <= n; k++) {
            int Fk = F1 + F2;
            System.out.println("F" + k + " = " + Fk);
            F1 = F2;
            F2 = Fk;
        }
    }
}
