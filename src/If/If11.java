package If;

import java.util.Scanner;

public class If11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  a, b;

        System.out.print("a = ");
        a = scanner.nextInt();

        System.out.print("b = ");
        b = scanner.nextInt();

        if (a != b){
            if (a > b){
                b = a;
            }else{
                a = b;
            }
        }else{
            a = 0;
            b = 0;
        }

        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
