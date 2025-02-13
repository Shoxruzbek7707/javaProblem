import java.util.Scanner;

public class If27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x ni kiriting: ");
        int x = scanner.nextInt();
        int f;

        if (x < 0) {
            f = 0;
        } else if (x % 2 == 0) {
            f = 1;
        } else {
            f = -1;
        }

        System.out.println("f(x) = " + f);

    }
}
