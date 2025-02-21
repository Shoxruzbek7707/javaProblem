package matrixs;

import java.util.Scanner;

public class Matrix004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m= ");
        int m = scanner.nextInt();

        System.out.print("n= ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        int[] array = new int[n];
        System.out.println("Massivni to'ldiring:");
        for (int i = 0;i < n;i++){
            System.out.println(i + "chi elementni kiritng::");
            array[i] = scanner.nextInt();
        }

        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                matrix[i][j] = array[j];
            }
        }

        System.out.println("Matrix elementlari:");
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
