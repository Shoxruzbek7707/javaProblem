package integers;

import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N,m,s,S;

        System.out.println("Sekund=");
        N = scanner.nextInt();

        if (N >= 3600){
            S = N / 3600;
            m = (N - S) / 60;
            s = N - S - m;  
            System.out.println( S+ " =Soat," + m+ " =Minut," + s + "=Sekund");
        }else {
            System.out.println("s >= 60 bo'lishi kerak! ");
        }
    }
}
