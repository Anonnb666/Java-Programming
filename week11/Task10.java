package week11;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS =10;
        final int NUMBER_OF_HOURS =24;
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        Scanner in = new Scanner(System.in);

        for(int k = 0; k < NUMBER_OF_DAYS*NUMBER_OF_HOURS; k++) {
            int day = in.nextInt();
            int hour = in.nextInt();
            double temperture = in.nextDouble();
            double humidity = in.nextDouble();
            data[day-1][hour-1][0] = temperture;
            data[day-1][hour-1][1] = humidity;
        }
        for(int k = 0; k < NUMBER_OF_DAYS*NUMBER_OF_HOURS; k++) {
            double dailyTemperature = 0,dailyHumidityTotal = 0;
            for(int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailyTemperature += data[k][j][0];
                dailyHumidityTotal += data[k][j][1];
            }

            System.out.println("Day "+(k+1)+"average temperature is: "+dailyTemperature/NUMBER_OF_HOURS);
            System.out.println("Day "+(k+1)+"'s humidity is: "+dailyHumidityTotal/NUMBER_OF_HOURS);
        }
    }
}
