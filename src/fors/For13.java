package fors;

import java.util.Scanner;

public class For13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();
        double S = 0;
        if (n>0){
            for (int i = 1;i <= n;i++){
               if (i%2==0){
                   S -= i / 10.0;
               }else{
                   S += i / 10.0;
               }
            }
            System.out.println(S);
        }else {
            System.out.println("n > 0 bo'lishi kerak! ");
        }
    }
}
