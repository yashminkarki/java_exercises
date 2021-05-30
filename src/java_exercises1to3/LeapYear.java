package java_exercises1to3;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		boolean isYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		System.out.println(year + " is a leap year? " + isYear);

	}
}
