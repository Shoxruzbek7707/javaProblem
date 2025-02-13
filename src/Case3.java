import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        switch (n){
            case 1 -> System.out.println("Qish");
            case 2 -> System.out.println("Qish");
            case 3 -> System.out.println("Bahor");
            case 4 -> System.out.println("Bahor");
            case 5 -> System.out.println("Bahor");
            case 6 -> System.out.println("Yoz");
            case 7 -> System.out.println("Yoz");
            case 8 -> System.out.println("Yoz");
            case 9 -> System.out.println("Kuz");
            case 10 -> System.out.println("Kuz");
            case 11 -> System.out.println("Kuz");
            case 12 -> System.out.println("Qish");
        }
    }
}
