package integers;

import java.util.Scanner;

public class Integer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, birXona,onXona;

        System.out.print("number=");
        number = scanner.nextInt();

        birXona = number % 10;
        onXona = number / 10 % 10;

        System.out.println("Bir xona= " + birXona);
        System.out.println("O'n xona " + onXona);
    }
}
