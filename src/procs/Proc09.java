package procs;

import java.util.Scanner;

public class Proc09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D,K;
        System.out.println("D=");
        D = scanner.nextInt();

        System.out.println("K=");
        K = scanner.nextInt();


    }
    public static int ChapTarafQoshish(int K,int D){
        return Integer.parseInt(D + "" + K);
    }
}
