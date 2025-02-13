import java.util.Scanner;

public class Boolean27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x,y;

        System.out.print("x=");
        x = scanner.nextInt();

        System.out.print("y=");
        y = scanner.nextInt();

        boolean result = (x < 0 && y > 0) ||(x < 0 && y < 0);

        System.out.print(result);
    }
}
