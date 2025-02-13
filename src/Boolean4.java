import java.util.Scanner;

public class Boolean4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;

        System.out.println("a=");
        a = scanner.nextInt();

        System.out.println("b=");
        b = scanner.nextInt();

        if (a > 2 && b <= 3){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
