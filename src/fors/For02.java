package fors;

import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,count = 0;
        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        if (a < b){
            for (int i = a;i <= b;i++){
                System.out.println(i);
                count++;
            }
            System.out.println("Chiqarilgan sonlar soni: " + count);
        }else{
            System.out.println("a < b bo'lishi kerak!");
        }

    }
}
