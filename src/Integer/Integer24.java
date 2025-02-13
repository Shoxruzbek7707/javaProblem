package Integer;

import java.util.Scanner;

public class Integer24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kun,haftaKuni;

        System.out.print("Kun=");
        kun = scanner.nextInt();

        haftaKuni = kun % 7;
        System.out.println("Haftaning " + haftaKuni + " kuni");

    }
}
