import java.util.Scanner;

public class Boolean20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,birXona,onXona,yuzXona;

        System.out.print("a=");
        a = scanner.nextInt();

        birXona = a % 10;
        onXona = a / 10 % 10;
        yuzXona = a / 100;

        if ((birXona !=onXona) && (birXona !=yuzXona) && (onXona != yuzXona)) {
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}
