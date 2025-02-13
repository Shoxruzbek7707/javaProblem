package Integer;

import java.util.Scanner;

public class Integer6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number,onXona,birXona;

        System.out.print("numer=");
        number = scanner.nextInt();

        onXona = number  / 10;
        birXona = number % 10;

        System.out.print("O'n xonasidagi raqam= " + onXona);
        System.out.print("Bir Xonasidagi raqam= " + birXona);
    }
}
