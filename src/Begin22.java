import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;

        System.out.print("a=");
        a = scanner.nextDouble();

        System.out.print("b=");
        b = scanner.nextDouble();

        double temp = a;
        a = b;
        b = temp;

        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
