package matrixs;

import java.util.Random;
import java.util.Scanner;

public class Matrix012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        System.out.print("m= ");
        m = scanner.nextInt();

        System.out.print("n= ");
        n = scanner.nextInt();

        Random random = new Random();
        int[][] array = new int[m][n];

        System.out.println("Matritsa:");
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Natija:");
        for (int j = 0;j < n;j++){
            if (j % 2 == 1){
                for (int i = 0;i < m;i++){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }else{
                for (int i = m - 1;i >= 0;i--){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
