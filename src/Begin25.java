import java.util.Scanner;

public class Begin25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x,y;

        System.out.println("x=");
        x = scanner.nextDouble();

        y = 3 * Math.pow(x,6) - 6 * Math.pow(x,2) - 7;

        System.out.println("Result= " + y);

    }
}
