package strings;

import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();

        if (1 <= n && n <= 26){
            for (int i = 0;i < n;i++){
                System.out.println((char) ('A' + i));
            }
        }else{
            System.out.println("1 <= n <= 26");
        }
    }
}
