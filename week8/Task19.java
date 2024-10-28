package week8;

public class Task19 {
    public static void main(String[] args) {
        printMax(1,3,5,7);
        printMax(new double[] {1, 3, 5, 7});
    }
    public static void printMax(double[] arr) {
        if (arr.length == 0) {
            System.out.println("No elements");
            return;
        }
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);
    }
    public static void printMax(double num1, double num2, double num3, double num4) {
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println("Max: " + num1);
        }
        else if (num2 > num1 && num2 > num3 && num2 > num4) {
            System.out.println("Max: " + num2);
        }
        else if (num3 > num1 && num3 > num2 && num3 > num4) {
            System.out.println("Max: " + num3);
        }
        else if (num4 > num1 && num4 > num2 && num4 > num3) {
            System.out.println("Max: " + num4);
        }
    }
}
