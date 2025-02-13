import java.util.Scanner;

public class Case18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int son;
        System.out.print("son=");
        son = scanner.nextInt();
        if (son >= 100 && son <= 999) {
            int yuzlar = son / 100;
            int onlar = (son / 10) % 10;
            int birlar = son % 10;

            String yuzlarSoz = "";
            String onlarSoz = "";
            String birlarSoz = "";

            switch (yuzlar) {
                case 1: yuzlarSoz = "bir yuz"; break;
                case 2: yuzlarSoz = "ikki yuz"; break;
                case 3: yuzlarSoz = "uch yuz"; break;
                case 4: yuzlarSoz = "to'rt yuz"; break;
                case 5: yuzlarSoz = "besh yuz"; break;
                case 6: yuzlarSoz = "olti yuz"; break;
                case 7: yuzlarSoz = "yetti yuz"; break;
                case 8: yuzlarSoz = "sakkiz yuz"; break;
                case 9: yuzlarSoz = "to'qqiz yuz"; break;
            }

            switch (onlar) {
                case 0: onlarSoz = ""; break;
                case 1: onlarSoz = " o'n"; break;
                case 2: onlarSoz = " yigirma"; break;
                case 3: onlarSoz = " o'ttiz"; break;
                case 4: onlarSoz = " qirq"; break;
                case 5: onlarSoz = " ellik"; break;
                case 6: onlarSoz = " oltmish"; break;
                case 7: onlarSoz = " yetmish"; break;
                case 8: onlarSoz = " sakson"; break;
                case 9: onlarSoz = " to'qson"; break;
            }

            switch (birlar) {
                case 0: birlarSoz = ""; break;
                case 1: birlarSoz = " bir"; break;
                case 2: birlarSoz = " ikki"; break;
                case 3: birlarSoz = " uch"; break;
                case 4: birlarSoz = " to'rt"; break;
                case 5: birlarSoz = " besh"; break;
                case 6: birlarSoz = " olti"; break;
                case 7: birlarSoz = " yetti"; break;
                case 8: birlarSoz = " sakkiz"; break;
                case 9: birlarSoz = " to'qqiz"; break;
            }

            System.out.println(yuzlarSoz + onlarSoz + birlarSoz);
        } else {
            System.out.println("Noto'g'ri son kiritildi");
        }
    }
}
