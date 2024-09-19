import java.util.Scanner;

public class exercise204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示用户输入驾驶距离、燃油效率和油价
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        // 计算驾驶成本
        double cost = (distance / milesPerGallon) * pricePerGallon;

        // 显示结果
        System.out.printf("The cost of driving is $%.2f\n", cost);
    }
}