import java.util.Scanner;

public class Sum_digits {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000");
        int number = input.nextInt();
        int lastDigit = number % 10;
        int remainingDigit = number/10;
        int secondDigit = remainingDigit % 10;
        remainingDigit = remainingDigit / 10;
        //int firstDigit = remainingDigit % 10;
        int sum = remainingDigit + secondDigit + lastDigit;
        System.out.print("The sum of the digits " + number + " is " + sum);


    }
}
