package week8;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("Enter a month number (1 to 12): ");
        Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();
        System.out.println("The month is: " + months[monthNumber]);
        sc.close();
    }
}
