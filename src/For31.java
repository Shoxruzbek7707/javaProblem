import  java.util.Scanner;
public class For31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n ni kiriting: ");
        int n = scanner.nextInt();
        double A = 2;

        for (int k = 1; k <= n; k++) {
            System.out.println("A" + k + " = " + A);
            A = 2 + 1 / A;
        }
    }
}
