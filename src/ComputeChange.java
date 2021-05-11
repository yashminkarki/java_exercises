import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount as integer, for example 1877");
        int amount = input.nextInt();

        int remainingAmount = amount;
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.print("Your amount " + amount + " consists of ");
        System.out.println(numberOfDollars + " dollars " + numberOfQuarters + " quarters " + numberOfDimes + " dimes " + numberOfNickels + " nickels " + numberOfPennies + " pennies.");
    }

}
