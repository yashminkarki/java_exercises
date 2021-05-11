import java.util.Scanner;
public class WindchillTemperature{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temp = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour : ");
        double windSpeed = input.nextDouble();
        double windChillIndex = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16));
        System.out.printf("The wind chill index is %.4f", windChillIndex);

    }


}
