package java_exercises1to3;
import java.util.Scanner;

public class RandomMonth {

	public static void main(String[] args) {
		int month1 = (int)(Math.random() * 12 + 1);
		
		System.out.print("The entered month number is "+ month1 +" ");
		switch(month1) {
			case 1: System.out.println("January"); break;
			case 2: System.out.println("February"); break;
			case 3: System.out.println("March"); break;
			case 4: System.out.println("April"); break;
			case 5: System.out.println("May"); break;
			case 6: System.out.println("June"); break;
			case 7: System.out.println("July"); break;
			case 8: System.out.println("August"); break;
			
			case 9: System.out.println("September"); break;
			case 10: System.out.println("October"); break;
			case 11: System.out.println("Novemeber"); break;
			case 12: System.out.println("December"); break;
			default: System.out.println("Error: Invalid input");
			
			
		}
		
	}

}
