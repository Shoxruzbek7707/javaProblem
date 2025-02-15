package cases;

import java.util.Scanner;

public class Case19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil;
        System.out.println("Yil=");
        yil = scanner.nextInt();
        int x= (yil - 1984) % 60;


        int rangIndex = x % 5;
        int hayvonIndex = x % 12;

        String rang = "";
        String hayvon = "";

        switch (rangIndex) {
            case 0: rang = "yashil"; break;
            case 1: rang = "qizil"; break;
            case 2: rang = "sariq"; break;
            case 3: rang = "oq"; break;
            case 4: rang = "qora"; break;
        }

        switch (hayvonIndex) {
            case 0: hayvon = "sichqon"; break;
            case 1: hayvon = "sigir"; break;
            case 2: hayvon = "yo'lbars"; break;
            case 3: hayvon = "quyon"; break;
            case 4: hayvon = "ajdar"; break;
            case 5: hayvon = "ilon"; break;
            case 6: hayvon = "ot"; break;
            case 7: hayvon = "qo'y"; break;
            case 8: hayvon = "maymun"; break;
            case 9: hayvon = "tovuq"; break;
            case 10: hayvon = "it"; break;
            case 11: hayvon = "to'ngiz"; break;
        }

        System.out.println(rang + " " + hayvon + " yili");
    }
}

