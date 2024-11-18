package week11;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        sumColumn(matrix, 0);
    }

    public static void sumColumn(double[][] m, int index) {
        for (int i = 0; i < m[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < m.length; j++) {
                sum += m[j][i];
            }
            System.out.printf("Sum of the elements at column %d is %.1f\n", index, sum);
            index++;
        }
    }
}
