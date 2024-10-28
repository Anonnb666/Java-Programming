package week8;

public class Task5 {
    public static void main(String[] args) {
        double[] mylist = new double[5];

        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = Math.random() * 10;
        }

        double total = 0;

        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + " ");
            total += mylist[i];
        }
        System.out.println();
        System.out.println("Sum of all elements is: " + total);
    }
}
