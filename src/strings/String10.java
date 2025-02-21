package strings;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("satr= ");
        String string = scanner.next();

        String stringReverse = "";
        for (int i = string.length() - 1;i >= 0;i--){
            stringReverse += string.charAt(i);
        }
        System.out.println(stringReverse);
    }
}
