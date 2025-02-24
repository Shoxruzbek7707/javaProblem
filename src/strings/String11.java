package strings;

import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String= ");
        String string  = scanner.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length();i++){
            sb.append(string.charAt(i));
            if (i < string.length() - 1){
                sb.append(" ");
            }
        }

        System.out.println(sb);





    }
}
