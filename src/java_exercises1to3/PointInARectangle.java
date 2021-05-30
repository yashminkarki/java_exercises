package java_exercises1to3;
import java.util.Scanner;
public class PointInARectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double x1 = input.nextInt();
		double y1 = input.nextInt();
		
		double horizontalDist = Math.pow(Math.pow(x1,2),0.5);
		double verticalDist =  Math.pow(Math.pow(y1,2),0.5);
		
		if (horizontalDist <= 10 /2 && verticalDist <= 5.0 /2) 
			System.out.print("Point (" + x1 + ", " +y1 + ") is in the rectangle.");
		else
			System.out.print("Point (" + x1 + ", " +y1 + ") is not in the rectangle.");

	}

}
