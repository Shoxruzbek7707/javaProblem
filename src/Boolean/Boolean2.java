package Boolean;

import java.util.Scanner;

public class Boolean2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A;

        System.out.print("A=");
        A = scanner.nextInt();

        if (A % 2 == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }




    }
}
