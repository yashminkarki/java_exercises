package java_exercises1to3;
import java.util.Scanner;
public class CurrentTimeAmPm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		
		long totalMilliSecond = System.currentTimeMillis();
		long totalSeconds = totalMilliSecond / 1000;
		
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes/60;
		long currentHours = totalHours % 24;
		
		currentHours += offset;
		
		System.out.print("The current time is " + ((currentHours > 12) ? currentHours-12 : currentHours)
				+ ":" + currentMinutes + ":" + currentSeconds + ((currentHours > 12) ? " PM" : " AM")) ;

	}

}
