/**
 * Write a program that enters 3 points in the plane (as integer x and y coordinates),
 * calculates and prints the area of the triangle composed by these 3 points. Round the result to a whole number.
 * In case the three points do not form a triangle, print "0" as result. Examples:
 */
import java.util.Scanner;
public class Triangle_area_02 {

    public static void calculateTriangleArea (double a, double b, double c){

        if (a>=(b+c)||(b>=(c+a))||(c>=(a+b))){
            System.out.println("0");
        }
        else{

            double p = (a+b+c)/2.0;
             double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        //round the results to whole number
            /*The java.lang.Math.round(float a) returns the closest int to the argument.
            The result is rounded to an integer by adding 1/2, taking the floor of the result,
            and casting the result to type int. Special cases:
                If the argument is NaN, the result is 0.
                If the argument is negative infinity or any value less than or
                equal to the value of Integer.MIN_VALUE, the result is equal to the value of Integer.MIN_VALUE.
            If the argument is positive infinity or any value greater than or equal to the value of
            Integer.MAX_VALUE, the result is equal to the value of Integer.MAX_VALUE.*/

            System.out.println(Math.round(area));

        }

    }

    public static void main(String[] args) {

        //read the coordinates of first point A
        Scanner scA = new Scanner(System.in);
        int Ax = scA.nextInt();
        int Ay = scA.nextInt();

        //read the coordinates of second point B
        Scanner scB = new Scanner(System.in);
        int Bx = scB.nextInt();
        int By = scB.nextInt();

        //read the coordinates of third point C
        Scanner scC = new Scanner(System.in);
        int Cx = scC.nextInt();
        int Cy = scC.nextInt();

        //calculate the length of 3 sides: a, b, c.
        double a = Math.sqrt((Ax-Bx)*(Ax-Bx)+(Ay-By)*(Ay-By));
        double b = Math.sqrt((Bx-Cx)*(Bx-Cx)+(By-Cy)*(By-Cy));
        double c = Math.sqrt((Cx-Ax)*(Cx-Ax)+(Cy-Ay)*(Cy-Ay));

        //call the method calculateTriangleArea and print the results.
        calculateTriangleArea (a, b, c);

    }
}
