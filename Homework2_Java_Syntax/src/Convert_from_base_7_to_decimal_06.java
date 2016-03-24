import java.util.Scanner;

/**
 * Write a program that converts from a base-7 number to its decimal representation
 */
public class Convert_from_base_7_to_decimal_06 {

    public static void main(String[] args) {
        //read decimal number num
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a base-7 number: ");
        String num =input.nextLine();
        char [] chars = num.toCharArray();

        /*int result, where we store the required decimal number*/
        int result = 0;

        /* Here we write a logic base - 7 to decimal conversion
        * loop drom first digit to last one
        */

        for (int i = 0; i <chars.length ; i++) {
            int digit = Character.getNumericValue(chars[i]);
            result = result + digit*((int)Math.pow(7,chars.length-1-i));
        }

        System.out.println("Base-7 to decimal: "+ result);

    }
}
