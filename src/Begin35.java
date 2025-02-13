import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double v,u,t1,t2,S;

        System.out.print("V=");
        v = scanner.nextDouble();

        System.out.print("U=");
        u = scanner.nextDouble();

        System.out.print("T1=");
        t1 = scanner.nextDouble();

        System.out.print("T2=");
        t2 = scanner.nextDouble();

        double oqimBoyicha = (v + u) * t1;
        double oqimgaQarshi = (v - u) * t2;

        S = oqimBoyicha + oqimgaQarshi;
        System.out.print("Qayiqni yurgan masofasi= " + S);
    }
}
