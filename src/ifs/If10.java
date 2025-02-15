package ifs;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result, a, b;

        System.out.print("a = ");
        a = scanner.nextInt();

        System.out.print("b = ");
        b = scanner.nextInt();

        if (a != b){
            a = a + b;
            b = a + b;
        }else{
            a = 0;
            b = 0;
        }

        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
