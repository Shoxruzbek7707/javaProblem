package strings;

import java.util.Scanner;

public class String24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("binary string= ");
        String string = scanner.next();

        int onlik = 0;
        int power = 1;

        for (int i = 0;i < string.length();i++){
            char bit = string.charAt(i);
            if (bit == '1'){
                onlik += power;
            }
            power *= 2;
        }

        System.out.println(onlik);
    }
}
