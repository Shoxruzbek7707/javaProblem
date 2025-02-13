import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A1=");
        double A1=scanner.nextDouble();

        System.out.print("B1=");
        double B1=scanner.nextDouble();

        System.out.print("C1=");
        double C1=scanner.nextDouble();

        System.out.print("A2=");
        double A2=scanner.nextDouble();

        System.out.print("B2=");
        double B2=scanner.nextDouble();

        System.out.print("C2=");
        double C2=scanner.nextDouble();

        double D=(A1*B2-A2*B1);
        System.out.println("D"+D);

        double x=(C1*B2-C2*B1)/D;
        double y=(A1*C2-A2*C1)/D;

        System.out.println("x "+x);
        System.out.println("y "+y);
    }
}
