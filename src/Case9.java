import java.util.Scanner;

public class Case9 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Kun va oyni kiriting (D M): ");
        int kun = skaner.nextInt();
        int oy = skaner.nextInt();
        System.out.print("Yilni kiriting: ");
        int yil = skaner.nextInt();

        int oyKunlari = 0;
        if (oy == 1 || oy == 3 || oy == 5 || oy == 7 || oy == 8 || oy == 10 || oy == 12) {
            oyKunlari = 31;
        } else if (oy == 4 || oy == 6 || oy == 9 || oy == 11) {
            oyKunlari = 30;
        } else if (oy == 2) {
            if (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0)) {
                oyKunlari = 29;
            } else {
                oyKunlari = 28;
            }
        }

        if (kun == oyKunlari) {
            kun = 1;
            oy = (oy == 12) ? 1 : oy + 1;
        } else {
            kun++;
        }

        System.out.println("Keyingi sana: " + kun + "-" + oy);
    }
}

