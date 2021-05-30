package java_exercises1to3;
import java.util.Scanner;
public class PalindromeCheck {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a three-digit integer: "); 
	int integer = input.nextInt();
	
	int digit1 = integer / 100;
	int remainingDigits = integer % 100;
	
	int digit3 = remainingDigits % 10;
	
	System.out.print(integer + ((digit1 == digit3) ? " is a " : " is not a " ) + "palindrome");

	}
}
