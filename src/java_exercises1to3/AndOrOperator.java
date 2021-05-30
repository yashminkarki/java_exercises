package java_exercises1to3;
import java.util.Scanner;
public class AndOrOperator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println("Is "+ number + " divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0));
		System.out.println("Is "+ number + " divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0));
		System.out.println("Is "+ number + " divisible by 5 or 6, but not both? " + (number % 5 == 0 ^ number % 6 == 0));
		
	}

}
