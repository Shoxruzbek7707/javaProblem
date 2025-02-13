package Integer;

import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("number=");
        number = scanner.nextInt();

        if (number < 9999){
            int result = number / 100 % 10;
            System.out.println("Result= " + result);
        }else {
            System.out.println("number < 999 bo'lishi kerak!");
        }
    }
}
