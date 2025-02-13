package For;

import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double S = 1.0;

        System.out.print("n=");
        n = scanner.nextInt();

        if (n>0){
            for (int i = 1;i <= n;i++){
                S *= (1.0 + i / 10.0);
            }
            System.out.println(S);
        }else {
            System.out.println("n > 0 bo'lishi kerak! ");
        }
    }
}
