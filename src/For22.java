import java.util.Scanner;
public class For22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("x = ");
        double x = scanner.nextDouble();


        double sum = x;
        double term = x;
        for (int i = 2; i <= n; i++) {
            term *= x / i;
            sum += term;
        }
        System.out.println("e^x - 1 ≈ " + sum);
    }
}
