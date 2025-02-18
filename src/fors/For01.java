package fors;

import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k,n;
        System.out.print("k=");
        k = scanner.nextInt();

        System.out.print("n=");
        n = scanner.nextInt();

        for (int i = 0;i < n;i++){
            System.out.println(k);
        }
    }
}
