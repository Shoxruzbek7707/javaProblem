package ifs;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0 ,a,b,c;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("c=");
        c = scanner.nextInt();

        if (a > 0){
            count++;
        }if (b > 0){
            count++;
        }if (c > 0){
            count++;
        }

        System.out.println(count);
    }
}
