package strings;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char begli;
        System.out.print("belgi=");
        begli = scanner.next().charAt(0);
        int oldingiBelgi = begli - 1;
        int keyingiBelgi = begli + 1;
        System.out.println("Oldin turuvchi belgi -> " + (char) oldingiBelgi);
        System.out.println("Keyingi turuvchi belgi -> " + (char) keyingiBelgi);
    }
}
