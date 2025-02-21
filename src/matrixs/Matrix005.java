package matrixs;

import java.util.Scanner;

public class Matrix005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m=");
        int m = scanner.nextInt();

        System.out.print("n=");
        int n = scanner.nextInt();

        System.out.print("d=");
        int d = scanner.nextInt();

        int[] array = new int[n];
        int[][] matrix = new int[m][n];

        System.out.println("Arrayni to'ldiring:");
        for (int i = 0;i < n;i++){
            System.out.println( i + " chi elementni kiriting:");
            array[i] = scanner.nextInt();
        }

        for (int i = 0;i < m;i++){
            matrix[i][0] = array[i];
        }

        for (int i = 0;i < m;i++){
            for (int j = 1;j < n;j++){
                matrix[i][j] = matrix[i][j - 1] + d;
            }
        }

        System.out.print("Matrix elementlari");
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
