import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x,a,y;

        System.out.print("x kg=");
        x = scanner.nextDouble();

        System.out.print("a so'm=");
        a = scanner.nextDouble();

        System.out.print("y kg=");
        y = scanner.nextDouble();

        double oneKg = a / x;
        System.out.println("1 kg -> " + oneKg);
        System.out.println("y kg ->" + oneKg * y);

    }
}
