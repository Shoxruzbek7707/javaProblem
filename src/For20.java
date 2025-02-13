import java.util.Scanner;
public class For20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();


        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int factorial = 1;
            for (int j = 1; j <= i;j++){
                factorial *= j;
            }
            sum += factorial;
        }
        System.out.println("Sum = " + sum);
    }
}
