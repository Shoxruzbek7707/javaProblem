package strings;

import java.util.Scanner;

public class String26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n= ");
        n = scanner.nextInt();

        System.out.print("String= ");
        String string = scanner.next();

        String result = "";
        if (string.length() > n){
            result = string.substring(string.length() - n);
        }else {
            result = ".".repeat(n - string.length()) + string;
        }
        System.out.println(result);
    }
}
