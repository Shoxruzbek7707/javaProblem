package strings;

import java.util.Scanner;

public class String21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String= ");
        String string = scanner.next();

        StringBuilder reversedNumber = new StringBuilder();

        for (int i = string.length() - 1;i >=0 ;i--){
            reversedNumber.append(string.charAt(i));
        }
        System.out.println(reversedNumber);

    }
}
