package strings;

import java.util.Scanner;

public class String09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satr 1 = ");
        String satr1 = scanner.next();

        System.out.print("Satr 2 = ");
        String satr2 = scanner.next();

        String newSting = satr1.concat(satr2);

        System.out.println("New string " + newSting);
    }
}
