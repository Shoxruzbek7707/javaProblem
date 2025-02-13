package If;

import java.util.Scanner;

public class If7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min,a,b;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        if (a < b){
            min = a;
        }else{
            min = b;
        }

        System.out.println(min);
    }
}
