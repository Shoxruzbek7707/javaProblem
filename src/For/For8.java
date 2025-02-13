package For;

import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,sum = 1;
        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();

        if (a < b){
            for (int i = a;i <= b;i++){
                sum*=i;
            }
            System.out.println(sum);
        }else{
            System.out.println("a < b bo'lishi kerak");
        }
    }
}
