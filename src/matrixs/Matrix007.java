package matrixs;

import java.util.Random;
import java.util.Scanner;

public class Matrix007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n,k;
        System.out.print("m=");
        m = scanner.nextInt();

        System.out.print("n=");
        n = scanner.nextInt();

        System.out.print("k=");
        k = scanner.nextInt();

        Random random = new Random();
        int[][] matrix = new int[m][n];
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                matrix[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Matrix elementlari:");
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                System.out.println(matrix[k][j] + " ");
            }
        }
        System.out.println();
    }
}
