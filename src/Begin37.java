import java.util.Scanner;

public class Begin37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double v1,v2,T,S;

        System.out.print("v1=");
        v1 = scanner.nextDouble();

        System.out.print("v2=");
        v2 = scanner.nextDouble();

        System.out.print("S=");
        S = scanner.nextDouble();

        System.out.print("T=");
        T = scanner.nextDouble();

        double result = S - (v1 + v2) * T;

        System.out.print("Mashinalar orasidagi masofa = " + result);
    }
}
