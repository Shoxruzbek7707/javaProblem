package matrixs;

import java.util.Random;
import java.util.Scanner;

public class Matrix011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        System.out.print("m=");
        m = scanner.nextInt();

        System.out.print("n=");
        n = scanner.nextInt();

        Random random = new Random();

        int[][] array = new int[m][n];

        System.out.println("\nMatritsa:");
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Natija:");
        for (int i = 0;i < m;i++){
            if (i % 2 == 0){
                for (int j = 0;j < n;j++){
                    System.out.print(array[i][j] +  " ");
                }
                System.out.println();
            }else{
                for (int j = n-1;j >= 0;j--){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

        }

    }
}
