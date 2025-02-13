import java.util.Scanner;
public class For28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();


        double sum = 0;
        for (int i = 1; i <= n; i++) {
            long factorial = 1;
            for (int j = 1; j <= 2 * i; j++) {
                factorial *= j;
            }
            sum += Math.pow(-1, i + 1) * (2 * i - 1) / factorial;
        }
        System.out.println("Sum = " + sum);
    }
}
