package Case;

import java.util.Scanner;

public class Case7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ogrlikBirlik,ogrlik;

        System.out.print("Og'rlik birligini tanlang:");
        ogrlikBirlik = scanner.nextInt();

        System.out.print("Og'likni  kiriting:");
        ogrlik = scanner.nextInt();

        int result = 0;

        switch (ogrlikBirlik){
            case 1: result = ogrlik;break;
            case 2: result = ogrlik / 1000000;break;
            case 3: result = ogrlik / 1000;break;
            case 4: result = ogrlik * 1000;break;
            case 5: result = ogrlik * 100;break;
            default: System.out.println("No'tg'ri birlik tanlandi!");break;
        }

        System.out.println(result);
    }
}
