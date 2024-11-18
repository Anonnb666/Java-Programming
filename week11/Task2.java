package week11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values in"+matrix.length+"rows and"+matrix[0].length+"columns:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
}