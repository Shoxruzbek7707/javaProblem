import java.util.Scanner;

public class If30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 dan 999 gacha son kiriting: ");
        int son = scanner.nextInt();

        if (son >= 1 && son <= 9) {
            System.out.println("Bir xonali son");
        } else if (son >= 10 && son <= 99) {
            System.out.println("Ikki xonali son");
        } else if (son >= 100 && son <= 999) {
            System.out.println("Uch xonali son");
        } else {
            System.out.println("Berilgan son 1-999 oralig'ida emas.");
        }


    }
}

