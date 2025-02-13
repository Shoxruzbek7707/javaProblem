import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max,a,b;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        if (a > b){
            max = a;
        }else{
            max = b;
        }

        System.out.println(max);
    }
}
