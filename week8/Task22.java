package week8;

import java.util.Scanner;

public class Task22 {
    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
        System.out.println("The minimum number is " + min(array));
    }
}
