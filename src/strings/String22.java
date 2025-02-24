package strings;

import java.util.Scanner;

public class String22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String= ");
        String string = scanner.next();

        int sum = 0;

        for (int i = 0;i < string.length();i++){
            sum +=  string.charAt(i) - '0';
        }

        System.out.println(sum);

    }
}
