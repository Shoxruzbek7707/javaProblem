package strings;

import java.util.Scanner;

public class String28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("c= ");
        char c = scanner.next().charAt(0);

        System.out.print("String= ");
        String string = scanner.next();

        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < string.length();i++){
            sb.append(string.charAt(i));
            if (c == string.charAt(i)){
                sb.append(string.charAt(i));
            }
        }
        System.out.println(sb);

    }
}
