import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,sum = 0;
        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        if (a < b){
            for (int i = a;i <= b;i++){
                sum+=Math.pow(i,2);
            }
            System.out.println(sum);
        }else{
            System.out.println("a < b bo'lishi kerak");
        }
    }
}
