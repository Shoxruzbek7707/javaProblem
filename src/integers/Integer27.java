package integers;

import java.util.Scanner;

public class Integer27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kun,haftaKuni;

        System.out.print("Kun=");
        kun = scanner.nextInt();

        haftaKuni = (kun + 6) % 7 + 1;
        System.out.println("Haftaning " + haftaKuni + " kuni");
    }
}
