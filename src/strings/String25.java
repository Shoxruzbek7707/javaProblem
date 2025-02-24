package strings;

import java.util.Scanner;

public class String25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("decimal string= ");
        String decimalString = scanner.next();

        int decimal = 0;
        for (int i = 0;i < decimalString.length();i++){
            decimal = decimal * 10 + (decimalString.charAt(i) - '0');
        }

        String binaryString = "";
        for (;decimal > 0;decimal/=2){
            binaryString = (decimal % 2) + binaryString;
        }

        System.out.println(binaryString);
    }
}
