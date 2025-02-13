import java.util.Scanner;
public class For35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n ni kiriting: ");
        int n = scanner.nextInt();
        double A1 = 1, A2 = 2, A3 = 3;

        System.out.println("A1 = " + A1);
        System.out.println("A2 = " + A2);
        System.out.println("A3 = " + A3);
        for (int k = 4; k <= n; k++) {
            double Ak = A2 + A1 - 2 * A3;
            System.out.println("A" + k + " = " + Ak);
            A1 = A2;
            A2 = A3;
            A3 = Ak;
        }
    }
}
