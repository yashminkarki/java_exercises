package java_exercises1to3;
import java.util.Scanner;
public class PointInACircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with coordinates: ");
		double x1 = input.nextInt();
		double y1 = input.nextInt();
		
		boolean withinCircle = (Math.pow(Math.pow(x1, 2) + Math.pow(y1, 2), 0.5) <= 10);
		
		System.out.println("Point (" + x1 + ", " + y1 +") is" + ((withinCircle) ? " in" : " not in") + " the circle."); 

	}

}
