package fors;

import java.util.Scanner;

public class For16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,a;
        System.out.print("n=");
        n = scanner.nextInt();

        System.out.print("a=");
        a = scanner.nextInt();

        if (n>0){
            for (int i=1; i<=n;i++){
                System.out.println("a ning " + i + " = " + Math.pow(a,i));
            }
        }else{
            System.out.println("n > 0 bo'lshi kerak!");
        }

    }
}
