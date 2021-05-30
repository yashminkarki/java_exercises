package java_exercises1to3;
import java.util.Scanner;
public class CostShipping {

	public static void main(String[] args) {
		System.out.print("Enter the weight of the package: ");
		
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
	
		
		if (weight > 50) {
			System.out.print("The package cannot be shipped");
		}
		else {
			if(weight > 0 && weight <=1) {
				System.out.print("The shipping cost is: $" + 3.5 * weight );
			}
			else if( weight <=3) {
				System.out.print("The shipping cost is: $ " + 5.5 * weight);
			}
			else if(weight <=10) {
				System.out.print("The shipping cost is: $" + 8.5 * weight);
			}
			else  {
				System.out.print("The shipping cost is: $" + 10.5 * weight);
			}
			
		}
		
	}

}
