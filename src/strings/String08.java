package strings;

import java.util.Scanner;

public class String08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n= ");
        n = scanner.nextInt();

        System.out.print("belgi= ");
        char belgi = scanner.next().charAt(0);

        String satr = "";
        for (int i = 0;i < n;i++){
            satr += belgi;
        }
        System.out.println(satr);
    }
}
