package java_exercises1to3;

import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points (x1,y1), (x2,y2), (x3,y3) of a triangle: ");
        double s1_x = input.nextDouble();
        double s1_y = input.nextDouble();
        double s2_x = input.nextDouble();
        double s2_y = input.nextDouble();
        double s3_x = input.nextDouble();
        double s3_y = input.nextDouble();
        double sideOne = Math.pow(Math.pow(s2_x-s1_x,2) + Math.pow(s2_y-s1_y,2),0.5);
        double sideTwo = Math.pow(Math.pow(s3_x-s2_x,2) + Math.pow(s3_y-s2_y,2),0.5);
        double sideThree = Math.pow(Math.pow(s1_x-s3_x,2) + Math.pow(s1_y-s3_y,2),0.5);
        double side = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.sqrt(side * ((side - sideOne)*(side - sideTwo)*(side - sideThree)));
        System.out.printf("The area of the triangle is %.2f ",area );



    }
}
