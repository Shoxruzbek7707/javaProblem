import java.util.Scanner;

public class If17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  a,b,c;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("c=");
        c = scanner.nextInt();

        if ((a < b && b < c) || (a > b && b > c)){
            a*=2;
            b*=2;
            c*=2;
        }else{
            a = -a;
            b = -b;
            c = -c;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
