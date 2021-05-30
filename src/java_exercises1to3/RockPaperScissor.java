package java_exercises1to3;
import java.util.Scanner;
public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Scissor(0), rock(1) paper(2)");
		int userInput = input.nextInt();
		
		int num = (int)(Math.random() * 3);
		
		switch(num) {
			case 0: System.out.print("The computer is scissor."); break;
			case 1: System.out.print("The computer is rock."); break;
			case 2: System.out.print("The computer is paper."); break;
		}
		
		System.out.print(" You are ");
		switch(userInput) {
			case 0: System.out.print("scissor"); break;
			case 1: System.out.print("rock"); break;
			case 2: System.out.print("paper"); break;
		}
		
		
		if (num == userInput) {
			System.out.print(" too. It is draw");
		}
		else {
			boolean win = (userInput == 0 && num == 2) || (userInput == 2 && num==1) || (userInput == 1 && num == 0);
			
			if (win) {
				System.out.print(" . You won.");
			}
			else {
				System.out.print(" . You lose.");
			}
			
		}
		
		

	}

}
