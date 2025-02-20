package funcs;

import java.util.Scanner;

public class Func01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("x=");
        x = scanner.nextInt();
        int result = Sign(x);
        System.out.println(result);

    }
    static int Sign(int x){
        if(x < 0){
            return -1;
        }
        if(x > 0){
            return 1;
        }
        return 0;
    }
}
