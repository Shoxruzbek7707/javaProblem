package cases;

import  java.util.Scanner;
public class Case15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kartani kiriting (6-14): ");
        int karta = scanner.nextInt();
        System.out.print("Mastni kiriting (1-4): ");
        int mast = scanner.nextInt();

        String kartaNomi = "", mastNomi = "";
        switch (karta) {
            case 6 -> kartaNomi = "Oltilik";
            case 7 -> kartaNomi = "Yettilik";
            case 8 -> kartaNomi = "Sakkizlik";
            case 9 -> kartaNomi = "To'qqizlik";
            case 10 -> kartaNomi = "O‘nlik";
            case 11 -> kartaNomi = "Valet";
            case 12 -> kartaNomi = "Dama";
            case 13 -> kartaNomi = "Qirol";
            case 14 -> kartaNomi = "Tuz";
            default -> System.out.println("Noto‘g‘ri karta!");
            }

        switch (mast) {
            case 1 -> mastNomi = "G'isht";
            case 2 -> mastNomi = "Olma";
            case 3 -> mastNomi = "Chillak";
            case 4 -> mastNomi = "Qarg'a";
            default -> System.out.println("Noto‘g‘ri mast!");

        }
        System.out.println(kartaNomi + " " + mastNomi);
    }
}

