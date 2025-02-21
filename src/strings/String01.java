package strings;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char belgi;
        System.out.print("belgi=");
        belgi = scanner.next().charAt(0);
        int n = (int) belgi;
        System.out.println(belgi + " ni kodi-> "  + n);
    }
}
