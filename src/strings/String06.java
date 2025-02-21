package strings;

import java.util.Scanner;

import static java.lang.Character.*;

public class String06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char belgi;
        System.out.print("belgi=");
        belgi = scanner.next().charAt(0);

        if (isDigit(belgi)){
            System.out.println("digit");
        }else if (isLetter(belgi)) {
            System.out.println("lotin");
        }
    }
}
