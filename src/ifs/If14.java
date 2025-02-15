package ifs;

import java.util.Scanner;

public class If14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  min,max,a,b,c;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("c=");
        c = scanner.nextInt();

        if (a > b && a > c){
            max = a;
        } else if (b > a && b > c ) {
            max = b;
        }else{
            max = c;
        }

        if (a < b && a < c){
            min = a;
        } else if (b < a && b < c ) {
            min = b;
        }else{
            min = c;
        }

        System.out.println(min);
        System.out.println(max);
    }
}
