package cases;

import java.util.Scanner;

public class Case01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        switch (n){
            case 1 -> System.out.println("Dushanba");
            case 2 -> System.out.println("Seshanba");
            case 3 -> System.out.println("Chorshanba");
            case 4 -> System.out.println("Payshnaba");
            case 5 -> System.out.println("Juma");
            case 6 -> System.out.println("Shanba");
            case 7 -> System.out.println("Yakshanba");
            default -> System.out.println("Bunday hafta kuni yo'q");
        }
    }
}
