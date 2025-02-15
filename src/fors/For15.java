package fors;

import java.util.Scanner;

public class For15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,a;
        System.out.print("n=");
        n = scanner.nextInt();

        System.out.print("a=");
        a = scanner.nextInt();

        int S = 1;
        if (n>0){
            for (int i=1; i<=n;i++){
                S *= a;
            }
            System.out.println(S);
        }else{
            System.out.println("n>0 bo'lshi kerak!");
        }

    }
}
