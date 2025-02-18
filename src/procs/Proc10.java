package procs;

import java.util.Scanner;

public class Proc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        System.out.print("x=");
        x = scanner.nextInt();

        System.out.print("y=");
        y = scanner.nextInt();

        almashtirish(x,y);
    }
    public static void almashtirish(int x,int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x=" + x);
        System.out.println("y= " + y);
    }
}
