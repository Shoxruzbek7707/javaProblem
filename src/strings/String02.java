package strings;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();
        if (32 < n && n <= 126){
            char S = (char) n;
            System.out.println(S);
        }


    }
}
