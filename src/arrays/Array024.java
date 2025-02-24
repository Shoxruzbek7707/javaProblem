package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array024 {
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

        System.out.println(ArifmetikProger(array));

    }
    static int ArifmetikProger(int[] arr){
        int d = arr[1] - arr[0];

        for (int i = 0;i < arr.length - 1;i++){
            if (arr[i+1] - arr[i] != d){
                return 0;
            }
        }
        return d;
    }
}
