package java_exercises1to3;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		
		//Generate lottery number
		int lotteryNumber = (int)(Math.random() * 100);
		//System.out.println(lotteryNumber);
		
		//Prompt the user to enter the number
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your lottery number(two digits): ");
		int num = input.nextInt();
		
		//Get digits from lottery
		int lotteryDigits1 = lotteryNumber / 10;
		int lotteryDigits2 = lotteryNumber % 10;

		//Get digits from entered number
		int numDigits1 = num / 10;
		int numDigits2 = num % 10;
		System.out.println("The lottery number is " + lotteryNumber);
		
		if (num == lotteryNumber) {
			System.out.println("You won $10,000.");
		}
		else if(lotteryDigits1 == numDigits2 && lotteryDigits2 == numDigits1){
			System.out.println("You won $3,000.");

		}
		else if(lotteryDigits1 == numDigits1 || lotteryDigits1 == numDigits2 || lotteryDigits2 == numDigits1 || lotteryDigits2 == numDigits2) {
			System.out.println("You won $1,000.");
		}
		else {
			System.out.println("Sorry no match.");
		}
	}

}
