import java.util.Scanner;
public class For34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n ni kiriting: ");
        int n = scanner.nextInt();
        double A1 = 1, A2 = 2;

        System.out.println("A1 = " + A1);
        System.out.println("A2 = " + A2);
        for (int k = 3; k <= n; k++) {
            double Ak = (A1 + 2 * A2) / 3;
            System.out.println("A" + k + " = " + Ak);
            A1 = A2;
            A2 = Ak;
        }
    }
}
