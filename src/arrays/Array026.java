package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n=");
        n = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[n];

        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(1,15);
        }

        System.out.println(JuftToq(array));
    }

    static int JuftToq(int[] array){
        for (int i = 0;i < array.length - 1;i++){
            if ((array[i] % 2 == 0 && array[i + 1] % 2 == 0) || (array[i] % 2 != 0 && array[i + 1] != 0)){
                return  i;
            }
        }
        return 0;
    }
}
