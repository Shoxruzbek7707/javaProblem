package strings;

import java.util.Scanner;

public class String17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String= ");
        String string = scanner.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0;i < string.length();i++){
            char c = string.charAt(i);
            if (Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else {
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
}
