package booleans;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("number=");
        number = scanner.nextInt();

        if ((number > 99 || number < 100) && (number % 2 ==1)){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}
