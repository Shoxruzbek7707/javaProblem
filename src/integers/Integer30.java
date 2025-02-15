package integers;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years,result;

        System.out.print("Yil= ");
        years  = scanner.nextInt();

        result = years / 100 + 1;

        System.out.println(result + " asr");
    }
}
