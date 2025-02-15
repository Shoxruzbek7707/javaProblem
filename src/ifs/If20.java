package ifs;

import java.util.Scanner;

public class If20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  min,max,a,b,c;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("c=");
        c = scanner.nextInt();

        int ab = Math.abs(a - b);
        int ac = Math.abs(a - c);

        if (ab < ac){
            System.out.println("Eng yaqin nuqta B: " + ab);
        }else{
            System.out.println("Eng yaqin nuqta C: " + ac);
        }
    }
}
