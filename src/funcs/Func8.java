package funcs;

import java.util.Scanner;

public class Func8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,y;
        System.out.print("x=");
        x = scanner.nextDouble();

        System.out.print("y=");
        y = scanner.nextDouble();

        System.out.println(Quarter(x,y));

    }
    public  static int Quarter(double x,double y){
        if (x > 0 && y > 0){
            return 1;
        }
        if (x < 0 && y > 0){
            return 2;
        }
        if (x < 0 && y < 0){
            return 3;
        }
        return 4;
    }
}
