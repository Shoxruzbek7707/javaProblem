import java.util.Scanner;

public class Integer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("number=");
        number = scanner.nextInt();

        int result = number / 100;

        System.out.print("Yuzlar xonasidagi raqam= " + result);
    }
}