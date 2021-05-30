package java_exercises1to3;
import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Scanner input = new Scanner(System.in);
		
		int isbn = input.nextInt();
		
		int digit1 = isbn / 100000000;
		int remainingDigits = isbn % 100000000;
	
		int digit2 = remainingDigits / 10000000;
		remainingDigits = remainingDigits % 10000000;
		
		int digit3 = remainingDigits / 1000000;
		remainingDigits = remainingDigits % 1000000;
		
		int digit4 = remainingDigits / 100000;
		remainingDigits = remainingDigits % 100000;
		
		int digit5 = remainingDigits / 10000;
		 remainingDigits = remainingDigits % 10000;
		
		int digit6 = remainingDigits / 1000;
		remainingDigits = remainingDigits % 1000;
		
		int digit7 = remainingDigits / 100;
		remainingDigits = remainingDigits % 100;
		
		int digit8 = remainingDigits / 10;
		remainingDigits = remainingDigits % 10;
		
		int digit9 = remainingDigits ;
	
		
		int digit10 = (digit1 * 1 +  digit2 * 2 +  digit3 * 3 +  digit4 * 4 +  digit5 * 5 +  digit6 * 6 + digit7 * 7 + digit8 * 8 +  digit9 * 9 ) % 11;
		
		
		System.out.print("The ISBN-10 number is " + isbn);
		
		if (digit10 == 10) {
			System.out.print("X");
		}
		else {
			System.out.print(digit10);
		}
	
		
		

	}

}
