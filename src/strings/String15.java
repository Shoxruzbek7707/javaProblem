package strings;

import java.util.Scanner;

public class String15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String= ");
        String string = scanner.next();

        int lotinCount = 0;
        int krilCount = 0;
        for (int c: string.toCharArray()){
            if (Character.isLowerCase(c)){
                if (c >= 'a' && c <= 'z'){
                    lotinCount++;
                } else if (c >= 'а' && c <= 'я') {
                    krilCount++;
                }
            }
        }
        System.out.println("Lotin harflari soni: " + lotinCount);
        System.out.println("Kril harflari soni: " + krilCount);
    }
}
