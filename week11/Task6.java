package week11;

public class Task6 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        }
        int maxOfRow = 0;
        int indexOfMaxRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            maxOfRow += matrix[0][i];
        }
        int totalOfThisRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                totalOfThisRow += matrix[i][j];
            }
            if (totalOfThisRow > maxOfRow) {
                maxOfRow = totalOfThisRow;
                indexOfMaxRow = i;
            }
        }
        System.out.println("Row: "+indexOfMaxRow+" has the maximum sum of "+maxOfRow);
    }
}
