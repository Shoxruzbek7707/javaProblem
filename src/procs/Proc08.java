package procs;

import java.util.Scanner;

public class Proc08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K,D;
        System.out.println("K=");
        K = scanner.nextInt();

        System.out.println("D=");
        D = scanner.nextInt();

        int result = OngTarafgaQoshish(K,D);

    }
     static int OngTarafgaQoshish(int K,int D){
        return  K * 10 + D;
    }

}
