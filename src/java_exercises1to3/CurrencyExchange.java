package java_exercises1to3;
import java.util.Scanner;

public class CurrencyExchange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchRate = input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice-versa: ");
		int choice = input.nextInt();
		
		switch(choice) {
			case 0: 
				System.out.print("Enter the dollar amount: ");
				double amount = input.nextDouble();
				System.out.print(amount + " is " + amount* exchRate + " yuan");
				break;
			case 1: 
				System.out.print("Enter the RMB amount: ");
				amount = input.nextDouble();
				System.out.print(amount + " is $" + (int)((amount*100) / exchRate)/100.0);
				break;
			default:
				System.out.print("Incorrect input");
				System.exit(1);
				
		}

	}

}
