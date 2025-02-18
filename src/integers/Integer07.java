package integers;

import java.util.Scanner;

public class Integer07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  number;

        System.out.print("number=");
        number = scanner.nextInt();

        int result = number / 10 + number % 10;

        System.out.print("Raqamlar yigindisi= " + result);
    }
}
