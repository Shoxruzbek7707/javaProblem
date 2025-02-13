import java.util.Scanner;

public class Integer25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kun,haftaKuni;

        System.out.print("Kun=");
        kun = scanner.nextInt();

        haftaKuni = (kun + 3)% 7;
        System.out.println("Haftaning " + haftaKuni + " kuni");
    }
}
