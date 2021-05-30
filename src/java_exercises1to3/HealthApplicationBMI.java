package java_exercises1to3;
import java.util.Scanner;
public class HealthApplicationBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter feet: ");
		int feet = input.nextInt();
		
		System.out.print("Enter inches: ");
		int inches = input.nextInt();
		
		double weightInKgs = weight * 0.45359237;
		
		double feetInchesInMeters = feet * 0.3048  + inches * 0.0254;
		
		double bmi = weightInKgs / (feetInchesInMeters * feetInchesInMeters);
		
		System.out.println("Bmi is: " + bmi);
		
		if (bmi < 18.5) {
			System.out.print("Underweight");
		}
		else if (bmi < 25) {
			System.out.print("Normal");
		}
		else if (bmi < 30) {
			System.out.print("Overweight");
		}
		else {
			System.out.print("Obese");
		}

}
}
