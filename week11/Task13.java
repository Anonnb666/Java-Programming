package week11;

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(2);
            }
        }

        printMatrix(arr);

        findRow(arr);
        findColumn(arr);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void findRow(int[][] matrix) {
        int maxRowIndex = -1;
        int maxRowCount = 0;

        // 查找包含最多1的行
        for (int i = 0; i < matrix.length; i++) {
            int rowCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRowIndex = i;
            }
        }

        System.out.println("The largest row index: " + maxRowIndex);

    }

    public static void findColumn(int[][] matrix) {
        int maxColumnIndex = -1;
        int maxColumnCount = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            int columnCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    columnCount++;
                }
            }
            if (columnCount > maxColumnCount) {
                maxColumnCount = columnCount;
                maxColumnIndex = j;
            }
        }

        System.out.println("The largest column index: " + maxColumnIndex);
    }
}
