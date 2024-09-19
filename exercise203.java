import java.util.Scanner;

public class exercise203 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // 提示用户输入体重和身高
            System.out.print("Enter weight in pounds: ");
            double weightInPounds = input.nextDouble();
            System.out.print("Enter height in inches: ");
            double heightInInches = input.nextDouble();

            // 将体重和身高转换为公制单位
            double weightInKilograms = weightInPounds * 0.45359237;
            double heightInMeters = heightInInches * 0.0254;

            // 计算BMI
            double bmi = weightInKilograms / (heightInMeters * heightInMeters);

            // 显示结果
            System.out.printf("BMI is %.4f\n", bmi);
    }
}
