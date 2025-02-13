import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min,max,a,b;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        max = Math.max(a,b);
        min = Math.min(a,b);

        System.out.println(max);
        System.out.println(min);
    }
}
