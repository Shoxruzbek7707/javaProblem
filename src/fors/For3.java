package fors;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,count = 0;
        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        if (a < b){
            for (int i = b;i >= a;i--){
                System.out.println(i);
                count++;
            }
            System.out.println("Chiqarilgan sonlar soni: " + count);
        }else{
            System.out.println("a < b bo'lishi kerak!");
        }
    }
}
