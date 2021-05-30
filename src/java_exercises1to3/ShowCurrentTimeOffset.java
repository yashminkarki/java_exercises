package java_exercises1to3;
import java.util.Scanner;

public class ShowCurrentTimeOffset {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalMillisecond = System.currentTimeMillis();
        long totalSeconds = totalMillisecond / 1000;

        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        currentHour += offset;
        System.out.print("The current time is " + currentHour + ":" + currentMinute +  ":" + currentSeconds);




    }
}
