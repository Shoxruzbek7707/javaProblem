import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;

        System.out.print("A=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("c=");
        c = scanner.nextInt();

        int squaeresAlongA = a / c;
        int squaeresAlongB = b / c;
        int totalSquares = squaeresAlongA * squaeresAlongB;
        int reaminArea = a * b - totalSquares * c * c;

        System.out.println("Joylashgan kvadratlar soni: " + totalSquares);
        System.out.println("Ortgan joy: " + reaminArea);
    }
}
