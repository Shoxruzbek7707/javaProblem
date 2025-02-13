package Boolean;

import java.util.Scanner;

public class Boolean22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number,birXona,onXona,yuzXona;

        System.out.print("Number=");
        number = scanner.nextInt();

        birXona = number % 10;
        onXona = number / 10  % 10;
        yuzXona = number / 100;

        boolean result = (birXona < onXona && onXona < yuzXona) ||  ( birXona > onXona && onXona > yuzXona);
        System.out.print(result);
    }
}
