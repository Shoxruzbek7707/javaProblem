package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n= ");
        n = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[n];
        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(-10,10);
        }
        System.out.println(ManfiyMusbat(array));
    }

    static int ManfiyMusbat(int[] array){
        for (int i = 0;i < array.length - 1;i++){
            if((array[i] > 0 && array[i + 1] > 0) || (array[i] < 0 && array[i + 1] < 0)){
                return i;
            }
        }
        return 0;
    }
}
