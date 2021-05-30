package java_exercises1to3;
import java.util.Scanner;
public class WindchillTemperature{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temp = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour : ");
        double windSpeed = input.nextDouble();
        
        boolean valid = (temp <= 41.0 && temp >= -58) && (windSpeed >= 2);
        
        
        if (!valid) {
        	System.out.print("The ");
        	if (temp < -58 || temp > 41) {
        		
        		System.out.print("temperature ");
        	}
        	if((temp < -58 || temp > 41) && windSpeed <2) {
        		System.out.print("and ");
        	}
        	if(windSpeed <2) {
        		System.out.print("wind speed ");
        	}
        	
        	System.out.print("is invalid.");
        	
        	System.exit(1);
        }
        double windChillIndex = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16));
        System.out.printf("The wind chill index is %.4f", windChillIndex);

    }


}
