package procs;

import java.util.Scanner;

public class Proc03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,y,AMean = 0,GMean = 0;
        System.out.print("x=");
        x = scanner.nextDouble();

        System.out.print("y=");
        y = scanner.nextDouble();
        mean(x,y,AMean,GMean);
    }
    public static void mean(double x,double y,double AMean,double GMean){
        AMean = (x + y) / 2;
        GMean = Math.sqrt(x * y);
        System.out.println("x va y ning o'rta arifmetigi: " + AMean);
        System.out.println("x va y ning geometrik o'rta qiymati: " + GMean);
    }
}
