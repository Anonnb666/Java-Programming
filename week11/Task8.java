package week11;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[][] m = getArray();

        System.out.println("\nSum of all elements is "+sum(m));
    }

    public static int[][] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    public static int sum(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }

}
