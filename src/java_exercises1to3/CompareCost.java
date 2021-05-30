package java_exercises1to3;
import java.util.Scanner;
public class CompareCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight and price for package1: ");
		double weight = input.nextDouble();
		double price = input.nextDouble();
		System.out.print("Enter weight and price for package2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		if (price/weight < price2/weight2)
			System.out.print("Package 1 has a better price.");
		else if (price/weight > price2/weight2)
			System.out.print("Package2 has a better price.");
		else 
			System.out.print("Two packages have the same price.");
		
	}

}
