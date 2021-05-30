package java_exercises1to3;
import java.util.Scanner;

public class Financial_Application {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the monthly savings amount");
        double monthly_income = input.nextDouble();
        double monthlyInterest = 0.417;
        double savings = 0.0;
        double total_amount = savings + monthly_income;
        savings = total_amount + (monthlyInterest/100 * total_amount);
        total_amount = savings + monthly_income;
        savings = total_amount + (monthlyInterest/100 * total_amount);
        total_amount = savings + monthly_income;
        savings = (savings + monthly_income) + (monthlyInterest/100 * (savings + monthly_income));
        total_amount = savings + monthly_income;
        savings = (savings + monthly_income) + (monthlyInterest/100 * (savings + monthly_income));
        total_amount = savings + monthly_income;
        savings = (savings + monthly_income) + (monthlyInterest/100 * (savings + monthly_income));
        total_amount = savings + monthly_income;
        savings = (savings + monthly_income) + (monthlyInterest/100 * (savings + monthly_income));
        total_amount = savings + monthly_income;
        System.out.println("The value in the account after the sixth month is " + savings);

    }

}
