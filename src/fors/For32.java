package fors;

import  java.util.Scanner;
public class For32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n ni kiriting: ");
        int n = scanner.nextInt();
        double A = 1;

        for (int k = 1; k <= n; k++) {
            System.out.println("A" + k + " = " + A);
            A = (A + 1) / k;
        }
    }
}
