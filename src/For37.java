import java.util.Scanner;
public class For37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N ni kiriting: ");
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 1;i <= n;i++){
            sum += i * i;
        }
        System.out.println(sum);
    }
}
