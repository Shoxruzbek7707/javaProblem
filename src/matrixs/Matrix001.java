package matrixs;

import java.util.Scanner;

public class Matrix001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        System.out.print("m");
        m = scanner.nextInt();

        System.out.print("n=");
        n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                matrix[i][j] = i * 10;
            }
        }

        System.out.println("Matritsani elementlari:");

        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
