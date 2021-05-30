package java_exercises1to3;
import java.util.Scanner;

public class Health_application {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        double weights = input.nextDouble();
        System.out.print("Enter the height in inches: ");
        double heights = input.nextDouble();
        double weights_kg = weights * 0.45359237;
        double heights_m = heights * 0.0254;
        double bmi = weights_kg / (heights_m* heights_m);
        System.out.printf("The BMI is %.4f" ,bmi);
    }
}
