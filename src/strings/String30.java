package strings;

import java.util.Scanner;

public class String30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("c= ");
        char c = scanner.next().charAt(0);

        System.out.print("s1= ");
        String s1 = scanner.next();

        System.out.print("s2= ");
        String s2 = scanner.next();

        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < s1.length();i++){
            sb.append(s1.charAt(i));
            if (c == s1.charAt(i)){
                sb.append(s2);
            }
        }
        System.out.println(sb);
    }
}
