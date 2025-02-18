package ifs;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("number=");
        number = scanner.nextInt();

        if (number > 0){
            number++;
        }

        System.out.println(number);
    }
}
