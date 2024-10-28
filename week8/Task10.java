package week8;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner sc = new Scanner(System.in);
        System.out.print("write the month you want:");
        int choice = sc.nextInt();
        System.out.println("The month you want is:" + month[choice - 1]);
    }
}
