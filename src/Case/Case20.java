package Case;

import java.util.Scanner;
public class Case20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yilni kiriting: ");
        int yil = scanner.nextInt();

        String rang = "", hayvon = "";
        switch ((yil - 1984) % 5) {
            case 0 -> rang = "Yashil";
            case 1 -> rang = "Qizil";
            case 2 -> rang = "Sariq";
            case 3 -> rang = "Oq";
            case 4 -> rang = "Qora";
            default -> System.out.println("Xatolik");
        }
        switch ((yil - 1984) % 12) {
            case 0 -> hayvon = "Sichqon";
            case 1 -> hayvon = "Sigir";
            case 2 -> hayvon = "Yo‘lbars";
            case 3 -> hayvon = "Quyon";
            case 4 -> hayvon = "Ajdar";
            case 5 -> hayvon = "Ilon";
            case 6 -> hayvon = "Ot";
            case 7 -> hayvon = "Qo‘y";
            case 8 -> hayvon = "Maymun";
            case 9 -> hayvon = "Tovuq";
            case 10 -> hayvon = "It";
            case 11 -> hayvon = "To‘ng‘iz";
            default -> System.out.println("Xatolik!");
        }
        System.out.println(rang + " " + hayvon + " yili");
    }
}
