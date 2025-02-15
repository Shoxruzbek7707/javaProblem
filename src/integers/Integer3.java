package integers;

import java.util.Scanner;

public class Integer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int by,kb;
        System.out.print("Bayt=");
        by = scanner.nextInt();

        kb = by / 1024;

        System.out.print("Kilobayt= " + kb);
    }
}
