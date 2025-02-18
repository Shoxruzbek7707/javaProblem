package funcs;

import java.util.Scanner;

public class Func6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;

        System.out.print("a=");
        a = scanner.nextInt();

        System.out.print("b=");
        b = scanner.nextInt();
    }
    public static int SumRange(int a,int b){
        if (a > b){
            return 0;
        }
        int sum = 0;
        for(int i= a;i <= b;i++){
            sum +=i;
        }
        return sum;
    }
}
