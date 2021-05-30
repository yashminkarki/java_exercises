package java_exercises1to3;
import java.util.Scanner;
public class SortThreeIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		int temp; 
		
	
		if (num1 > num2 || num1 > num3) {   //in ascending order
			if (num1 > num2) {
				temp = num1;
				num1 = num2;
				num2 = temp;
				
			}
			
			if (num1 > num3) {
				temp = num1;
				num1 = num3;
				num3 = temp;
			}	
		}
		
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
			
		}
		
		
		System.out.print(num1 + " " + num2 + " " + num3);
		
		
	}

}
