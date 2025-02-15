package fors;

import  java.util.Scanner;
public class For26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("x = ");
        double x = scanner.nextDouble();

        double sum = 0;
        for (int i = 1;i <= n;i++){
            sum += Math.pow(-1,i + 1) * Math.pow(x,2 * i - 1) / (2 * i -1);
        }
        System.out.println(sum);
    }
}
