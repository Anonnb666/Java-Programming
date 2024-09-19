import java.util.Scanner;

public class exercise202 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the subtotal and a gratuity rate: ");
            double subtotal = input.nextDouble();
            double gratuityRate = input.nextDouble();

            double gratuity = subtotal * (gratuityRate / 100);
            double total = subtotal + gratuity;
            System.out.printf("The gratuity is $%.2f and total is $%.2f\n", gratuity, total);
    }
}


