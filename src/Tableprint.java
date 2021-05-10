import java.lang.Math;
public class Tableprint {
    public static void main(String[] args)
    {
        System.out.println("a    a^2    a^3");
        for (int i = 1; i < 5; i++)
        {
            if (i == 4)
            {
                System.out.format("%d     " + "%d    " + "%d\n", i, (int)Math.pow(i,2), (int)Math.pow(i,3));
            }
            else{
                System.out.format("%d     " + "%d     " + "%d\n", i, (int)Math.pow(i,2), (int)Math.pow(i,3));
            }

        }
    }
}
