import java.util.Scanner;

public class Integer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  number,birXona,onXona;

        System.out.print("number=");
        number = scanner.nextInt();

        birXona = number % 10;
        onXona = number  / 10;

        number = birXona * 10 + onXona;
        System.out.print("Result= " + number);
    }
}
