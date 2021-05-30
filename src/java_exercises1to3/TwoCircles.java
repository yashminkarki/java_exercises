package java_exercises1to3;
import java.util.Scanner;
public class TwoCircles {

	public static void main(String[] args) {
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		Scanner input= new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		
		if (Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2), 0.5) <= Math.abs(r1-r2)){
			System.out.print("circle2 is inside circle1");
	
		}
		else if (Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2), 0.5) <= r1+r2){
			System.out.print("circle2 overlaps circle1");
	
		}
		else {
			System.out.print("circle2 does not overlap circle1");
		}
		
	}

}
