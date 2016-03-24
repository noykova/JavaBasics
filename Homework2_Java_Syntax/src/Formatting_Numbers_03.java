import java.util.Scanner;

/**
 * Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500),
 * a floating-point b and
 * a floating-point c and prints them in 4 virtual columns on the console.
 * Each column should have a width of 10 characters.
 * The number a should be printed in hexadecimal, left aligned;
 * then the number a should be printed in binary form, padded with zeroes,
 * then the number b should be printed with 2 digits after the decimal point, right aligned;
 * the number c should be printed with 3 digits after the decimal point, left aligned
 */

public class Formatting_Numbers_03 {
    public static void main(String[] args) {

        //read number a
        Scanner sc = new Scanner(System.in);
        short a = sc.nextShort();
        //Integer.toBinaryString(x);
        //Integer.toString(x,2)
        String sa = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.printf("|%-10x|%s|%10.2f|%-10.3f|",a,sa,b,c);

    }
}
