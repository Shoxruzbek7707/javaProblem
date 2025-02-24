package strings;

import java.util.Scanner;

public class String13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("string= ");
        String string = scanner.next();

        int count = 0;
        for (int i = 0;i < string.length();i++){
            char c = string.charAt(i);
             if (Character.isDigit(c)){
                count++;
             }
        }
        System.out.println("Raqamlar soni:" + count);

    }
}
