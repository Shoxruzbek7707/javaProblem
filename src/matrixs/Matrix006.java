package matrixs;

import java.util.Scanner;

public class Matrix006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m=");
        int m = scanner.nextInt();

        System.out.print("n=");
        int n = scanner.nextInt();

        System.out.print("q=");
        int q = scanner.nextInt();

        int[] array = new int[m];

        int[][] matrix = new int[m][n];

        System.out.println("Array to'lidirng:");
        for (int i = 0;i < m;i++){
            System.out.println(i + " elementni kiriting:");
            array[i] = scanner.nextInt();
        }

        for (int i = 0;i < m;i++){
            matrix[i][0] = array[i];
        }


        for (int i = 0;i < m;i++){
            for (int j = 1;j < n;j++){
                matrix[i][j] = matrix[i][j - 1] * q;
            }
        }

        System.out.println("Matrix elementlari:");
        for (int i = 0;i < m;i++){
            for(int j = 1;j < n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
