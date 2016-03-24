/**
 *Write a program that enters the sides of a rectangle
 * (two integers a and b) and calculates and prints the rectangle's area.
 */
public class Rectangle_Area_01 {

    public static void calculateRectangleArea (int a, int b){

        int area = a*b;
        System.out.println(area);
    }

    public static void main(String[] args) {


        calculateRectangleArea(7, 20);
        calculateRectangleArea(5, 12);
    }
}
