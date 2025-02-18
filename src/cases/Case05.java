package cases;

import java.util.Scanner;

public class Case05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int a,b,n;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        System.out.print("n=");
        n = scanner.nextInt();

        switch (n){
            case 1 -> System.out.println(a+b);
            case 2 -> System.out.println(a-b);
            case 3 -> System.out.println(a/b);
            case 4 ->  System.out.println(a*b);

        }


    }
}
