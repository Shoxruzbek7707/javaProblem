import java.util.Scanner;

public class Integer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M,t;
        System.out.print("kilogram=");
        M = scanner.nextInt();

        t = M / 1000;

        System.out.print("Tonna= " + t);
    }
}
