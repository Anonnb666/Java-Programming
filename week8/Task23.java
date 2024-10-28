package week8;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<5; i++){
            int temp = a[i];
            a[i] = a[9-i];
            a[9-i] = temp;
        }
        System.out.println("After swap, the array is: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
