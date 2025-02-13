import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double P,c,a,b;
        System.out.print("a=");
        a = scanner.nextDouble();
        System.out.print("b=");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        P = a + b + c;
        System.out.println("Gipotenuzasi: " + c);
        System.out.println("Perimetri: " + P);
    }
}
