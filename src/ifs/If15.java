package ifs;

import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  a,b,c;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("c=");
        c = scanner.nextInt();

        int sumab = a + b;
        int sumac = a + c;
        int sumbc = b + c;

        if (sumab > sumac && sumab > sumbc){
            System.out.println("Eng katta ikkta son yig'indisi: " + a +" va " + b);
        } else if (sumac > sumab && sumac > sumbc) {
            System.out.println("Eng katta ikkta son yig'indisi: " + a +" va " + c);
        }else{
            System.out.println("Eng katta ikkta son yig'indisi: " + b +" va " + c);
        }


    }
}
