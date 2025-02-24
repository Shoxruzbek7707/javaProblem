package strings;

import java.util.Scanner;

public class String14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("string= ");
        String string = scanner.next();

        int count = 0;
        for (int i = 0;i < string.length();i++){
            char c = string.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                  count++;
            }
        }

        System.out.println("Lotin harflari soni: " + count);
    }
}
