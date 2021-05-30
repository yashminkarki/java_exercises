package java_exercises1to3;
import java.util.Scanner;

public class Populationproject {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int currentpop = input.nextInt();
        int year_insec = 365 * 24 * 60 * 60;
        int pop = currentpop + (year_insec / 7) - (year_insec / 13) + (year_insec / 45);
        System.out.printf("In one year the population will be %d\n", pop);
        pop = currentpop + (2 * ((year_insec / 7) - (year_insec / 13) + (year_insec/ 45)));
        System.out.printf("In two year the population will be %d\n", pop);
        pop = currentpop + (3 * ((year_insec / 7) - (year_insec / 13) + (year_insec/ 45)));
        System.out.printf("In three year the population will be %d\n", pop);
        pop = currentpop + (4 * ((year_insec / 7) - (year_insec / 13) + (year_insec/ 45)));
        System.out.printf("In four year the population will be %d\n", pop);
        pop = currentpop + (5 *((year_insec / 7) - (year_insec / 13) + (year_insec/ 45)));
        System.out.printf("In five year the population will be %d", pop);
    }
}
