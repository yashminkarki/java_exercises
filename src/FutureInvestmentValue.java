import java.util.Scanner;
public class FutureInvestmentValue{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the investment amount: ");
        double investment_amt = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double interest_rate = input.nextDouble();
        interest_rate = interest_rate/1200;
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        double future_investmentVal = investment_amt * Math.pow(1+interest_rate, years*12);
        System.out.printf("Accumulated value is $%.2f",future_investmentVal);
    }

}
