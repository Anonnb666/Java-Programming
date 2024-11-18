package week11;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int [][] arr = {{1,2},{3,4},{5,6},{7,8},{9,10}};
        shuffle(arr);

        for(int[] row : arr) {
            for(int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void shuffle(int[][] m) {
        Random r = new Random();
        for (int i = m.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int[] temp = m[i];
            m[i] = m[j];
            m[j] = temp;
        }
    }
}
