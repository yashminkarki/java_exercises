package java_exercises1to3;
import java.util.Scanner;

public class NumberOfYear {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int year = minutes / 525600;

        int days = (minutes % 525600) / 1440;

        System.out.println(minutes + " minutes is approximately " + year + " years and " + days + " days.");

    }
}
