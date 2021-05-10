import java.util.Scanner;

public class SubtotalGratuity {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate: ");
        int subtotal = input.nextInt();
        double gratuity_rate = input.nextDouble();
        double gratuity = gratuity_rate/subtotal;
        double total = subtotal + gratuity;
        System.out.printf("The gratuity is $%.2f and total is $%.2f", gratuity, total);
    }

}
