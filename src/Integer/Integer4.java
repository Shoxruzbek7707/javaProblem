package Integer;

import java.util.Scanner;

public class Integer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;
        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        if (a > b){
            int result = a / b;
            System.out.print(result + " marta");
        }else {
            System.out.print("(A > B)");
        }
    }
}
