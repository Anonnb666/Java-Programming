package week8;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Enter the number of items:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] mylist = new double[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            mylist[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < mylist.length; i++) {
            sum = sum + mylist[i];
        }
        double average = sum / n;
        System.out.println("Average is " + average);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (mylist[i] > average)
                count++;
        }
        System.out.println("Number of elements above the average is " + count);
    }
}
