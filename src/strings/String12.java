package strings;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0;i < n;i++){
            sb.append("*");
        }
        System.out.println(sb);
    }
}
