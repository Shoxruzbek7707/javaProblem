package cases;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        switch (n){
            case 1 -> System.out.println("Yomon");
            case 2 -> System.out.println("Qoniqarsiz");
            case 3 -> System.out.println("Qoniqarli");
            case 4 -> System.out.println("Yaxshi");
            case 5 -> System.out.println("A'lo");
            default -> System.out.println("Xato");
        }
    }
}
