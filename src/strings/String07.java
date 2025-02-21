package strings;

import java.util.Scanner;

public class String07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("satr= ");
        String satr = scanner.nextLine();

        char birinchiBelgi =  satr.charAt(0);
        char oxirgiBelgi = satr.charAt(satr.length() - 1);

        System.out.println("Satrnihg birinchi belgisi -> " + birinchiBelgi);
        System.out.println("Satrning oxirgi belgisi -> " + oxirgiBelgi);
    }
}
