import java.util.Scanner;

public class Integer16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, birXona,onXona,yuzXona;

        System.out.print("number=");
        number = scanner.nextInt();

        birXona = number % 10;
        onXona = number / 10 % 10;
        yuzXona = number / 1000;

        int result = yuzXona * 100 + birXona * 10 + onXona;

        System.out.println("Result= " + result);
    }
}
