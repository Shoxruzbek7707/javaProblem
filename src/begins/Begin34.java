package begins;

import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x,a,y,b;

        System.out.print("x kg=");
        x = scanner.nextDouble();

        System.out.print("a so'm=");
        a = scanner.nextDouble();

        System.out.print("y kg=");
        y = scanner.nextDouble();

        System.out.print("b so'm=");
        b = scanner.nextDouble();

        double shokolod = a / x, konfet  = b / y;

        System.out.print("1 kg shokold - 1 kg konfet = " + (shokolod - konfet));
    }
}
