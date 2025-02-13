import java.util.Scanner;

public class Integer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L,m;
        System.out.print("Santimetr=");
        L = scanner.nextInt();

        m = L / 100;

        System.out.print("Metr= " + m);


    }
}
