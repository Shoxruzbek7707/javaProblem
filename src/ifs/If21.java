package ifs;

import java.util.Scanner;

public class If21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x,y;
        System.out.print("x=");
        x = scanner.nextInt();

        System.out.print("y=");
        y = scanner.nextInt();

        if (x == 0 && y == 0){
            System.out.println(0);
        }else if (x == 0 || y == 0){
            if (x == 0){
                System.out.println(1);
            }else {
                System.out.println(2);
            }
        }else {
            System.out.println(3);
        }
    }
}
