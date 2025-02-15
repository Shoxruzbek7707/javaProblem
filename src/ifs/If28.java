package ifs;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yilni kiriting: ");
        int yil = scanner.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " - kabisa yili, 366 kun.");
        } else {
            System.out.println(yil + " - kabisa yili emas, 365 kun.");
        }

    }
}
