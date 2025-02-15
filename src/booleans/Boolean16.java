package booleans;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("number=");
        number = scanner.nextInt();

        if ((number > 10 || number <= 99) && (number % 2 == 0)){
            System.out.print(true);
        }else {
            System.out.print(false);
        }
    }
}
