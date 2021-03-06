package java_exercises1to3;
import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("0-single filer, 1-married jointly or Qulaifying widower, 2-married separately, 3-head of household: ");
		int status = input.nextInt();
		
		System.out.print("enter the taxable income: ");
		double income = input.nextDouble();
		
		double tax = 0;
		
		if (status == 0) {
			if (income <= 8350)
				tax = income * 0.1;
			else if (income <= 33950)
				tax = 8350 * 0.1 + (income - 8350) * 0.15;
			else if (income <= 82250)
				tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 171550)
				tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
			else {
				tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 
						+ (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
				
			}
		}
		else if(status == 1) {
			if (income <= 16700)
				tax = income * 0.1;
			else if (income <= 67900)
				tax = 16700 * 0.1 + (income - 16700) * 0.15;
			else if (income <= 137050)
				tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
			else if (income <= 208850)
				tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
			else if (income <= 372950)
				tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
			else {
				tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 
						+ (income - 372950) * 0.35;
				
			}
		}
		else {
			System.out.println("Error: invalid status");
			System.exit(1);
		}
		
		
		
	}

}
