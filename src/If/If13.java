package If;

import java.util.Scanner;

public class If13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  result,a,b,c;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("c=");
        c = scanner.nextInt();

        if ((a > b && a < c) || (a < b && a > c)){
            result = a;
        }else if ((b > a && b < c) || (b < a && b > c)) {
            result = b;
        }else {
            result = c;
        }

        System.out.println(result);
    }
}
