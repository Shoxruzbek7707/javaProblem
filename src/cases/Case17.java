package cases;

import java.util.Scanner;

public class Case17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int son;
        System.out.print("n=");
        son = scanner.nextInt();
        if (son >= 10 && son <= 40) {
            int onlar = son / 10;
            int birlar = son % 10;

            String onlarSoz = "";
            String birlarSoz = "";

            switch (onlar) {
                case 1:
                    onlarSoz = "o'n";
                    break;
                case 2:
                    onlarSoz = "yigirma";
                    break;
                case 3:
                    onlarSoz = "o'ttiz";
                    break;
                case 4:
                    onlarSoz = "qirq";
                    break;
            }

            switch (birlar) {
                case 0:
                    birlarSoz = "";
                    break;
                case 1:
                    birlarSoz = " bir";
                    break;
                case 2:
                    birlarSoz = " ikki";
                    break;
                case 3:
                    birlarSoz = " uch";
                    break;
                case 4:
                    birlarSoz = " to'rt";
                    break;
                case 5:
                    birlarSoz = " besh";
                    break;
                case 6:
                    birlarSoz = " olti";
                    break;
                case 7:
                    birlarSoz = " yetti";
                    break;
                case 8:
                    birlarSoz = " sakkiz";
                    break;
                case 9:
                    birlarSoz = " to'qqiz";
                    break;
            }

            System.out.println(onlarSoz + birlarSoz);
        } else {
            System.out.println("Case 17: Noto'g'ri son kiritildi");
        }


        }
    }
