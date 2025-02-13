package Case;

import  java.util.Scanner;
public class Case14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1-Tomoni, 2-Ichki aylana radiusi, 3-Tashqi aylana radiusi, 4-Yuza. Qaysi element kiritiladi? ");
        int tanlov = scanner.nextInt();
        System.out.print("Qiymatni kiriting: ");
        double qiymat = scanner.nextDouble();
        double natija = 0;
        switch (tanlov) {
            case 1 -> natija = (qiymat * Math.sqrt(3)) / 6;
            case 2 -> natija = qiymat * 2;
            case 3 -> natija = (qiymat * Math.sqrt(3)) / 4;
            case 4 -> natija = (Math.pow(qiymat, 2) * Math.sqrt(3)) / 4;
            default -> System.out.println("Noto‘g‘ri tanlov!");

        }
        System.out.println("Natija: " + natija);

    }
}
