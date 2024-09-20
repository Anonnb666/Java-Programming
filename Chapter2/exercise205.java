import java.util.Scanner;

public class exercise205 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter the length of the side: ");
                double side = input.nextDouble();

                double area = (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;

                System.out.printf("The area of the hexagon is %.4f\n", area);
        }
}

