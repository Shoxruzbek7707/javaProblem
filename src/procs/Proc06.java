package procs;

import java.util.Scanner;

public class Proc06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K,count = 0,sum = 0;

        System.out.print("K=");
        K = scanner.nextInt();
        raqamCountSum(K,count,sum);
    }
    public static void raqamCountSum(int K,int count,int sum){
        while (K > 0){
            sum += K % 10;
            count ++;
            K /= 10;
        }
        System.out.println("Raqamlar soni: " + count);
        System.out.println("Raqamlar yig'indisi: " + sum);
    }
}
