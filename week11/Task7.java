package week11;

public class Task7 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1=(int)(Math.random()*matrix.length);
                int j1=(int)(Math.random()*matrix[i].length);
                int temp=matrix[i1][j1];
                matrix[i1][j1]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        System.out.println("Array after shuffling: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
