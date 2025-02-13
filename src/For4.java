import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int narx;

        System.out.print("narx=");
        narx = scanner.nextInt();

        for (int i = 1;i <= 10;i++){
            System.out.println(i + "-kg = " + i * narx );
        }
    }
}
