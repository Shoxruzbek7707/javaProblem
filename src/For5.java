import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int narx;

        System.out.print("narx=");
        narx = scanner.nextInt();

        for (double i = 0.1;i <= 1;i+=0.1){
            System.out.println(i + "-kg = " +i * narx);
        }
    }
}
