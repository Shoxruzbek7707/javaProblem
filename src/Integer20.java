import java.util.Scanner;

public class Integer20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s,m;

        System.out.println("Sekund=");
        s = scanner.nextInt();

        if (s >= 3600){
            m = s / 60;
            System.out.println("Soat=" + m);
        }else {
            System.out.println("s >= 60 bo'lishi kerak! ");
        }
    }
}
