package strings;

import java.util.Scanner;

public class String27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1,N2;
        System.out.print("N1= ");
        N1 = scanner.nextInt();

        System.out.print("N2= ");
        N2 = scanner.nextInt();

        System.out.print("s1= ");
        String s1 = scanner.next();

        System.out.print("s2= ");
        String s2 = scanner.next();

        String newString = s1.substring(0,N1) + s2.substring(s2.length() - N2);
        System.out.println(newString);
    }
}
