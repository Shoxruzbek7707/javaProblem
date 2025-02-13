import java.util.Scanner;

public class If23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A nuqta koordinatalarini kiriting (x1 y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("B nuqta koordinatalarini kiriting (x2 y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("C nuqta koordinatalarini kiriting (x3 y3): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        int x4, y4;

        // To‘rtinchi nuqta koordinatasini topish
        if (x1 == x2) {
            x4 = x3;
        } else if (x1 == x3) {
            x4 = x2;
        } else {
            x4 = x1;
        }

        if (y1 == y2) {
            y4 = y3;
        } else if (y1 == y3) {
            y4 = y2;
        } else {
            y4 = y1;
        }

        System.out.println("To‘rtinchi nuqta koordinatalari: (" + x4 + ", " + y4 + ")");

    }
}

