package funcs;

import java.util.Scanner;

public class Func3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R;
        System.out.print("R=");
        R = scanner.nextInt();
        double result = Circles(R);
        System.out.println(result);
    }
    public static double Circles(double R){
        return 3.14 * R * R;
    }
}
