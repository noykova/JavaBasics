/*
 * Write a program that converts the decimal number system to the ghetto numeral system.
 * In the ghetto, numbers are represented as following:
 	0 – Gee
 	1 – Bro
 	2 – Zuz
 	3 – Ma
 	4 – Duh
 	5  - Yo
 	6 – Dis
 	7 – Hood
 	8 – Jam
 	9 – Mack
 */

import java.util.Scanner;
public class ChettoNumeralSystem07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String  strNumber = sc.nextLine();
        char [] charArr = strNumber.toCharArray();


        for (int i = 0; i <strNumber.length() ; i++) {

            switch (charArr[i]) {
                case '0':
                    System.out.print("Gee");
                    break;
                case '1':
                    System.out.print("Bro");
                    break;
                case '2':
                    System.out.print("Zuz");
                    break;
                case '3':
                    System.out.print("Ma");
                    break;
                case '4':
                    System.out.print("Duh");
                    break;
                case '5':
                    System.out.print("Yo");
                    break;
                case '6':
                    System.out.print("Dis");
                    break;
                case '7':
                    System.out.print("Hood");
                    break;
                case '8':
                    System.out.print("Jam");
                    break;
                case '9':
                    System.out.print("Mack");
                    break;
                default:
                    System.out.print("Invalid number");
                    break;
            }
            //System.out.println();
        }
    }
}
