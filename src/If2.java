import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("number=");
        number = scanner.nextInt();

        if (number > 0){
            number++;
        }else {
            number-=2;
        }

        System.out.println(number);
    }
}
