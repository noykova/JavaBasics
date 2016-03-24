import java.util.Scanner;

/**
 * You are given an array of integers as a single line, separated by a space.
 * Write a program that checks consecutive pairs and prints if both are odd/even or not.
 * Note that the array length should also be an even number
 */
public class Odd_and_Even_Pairs_08 {

    public static void main(String[] args) {

        //enter an even number N
        Scanner input = new Scanner( System.in );
        System.out.print("Enter an even number integer numbers separated by white space: ");
        String string =input.nextLine();
        //split the string to parts, separated by white space:
        String[] parts = string.split(" ");
        
        //check if the number of parts is even
        if (parts.length%2!=0){
            System.out.println("Invalid Integer");
        }
        
        int [] ints = new int [parts.length];
        for (int i = 0; i <parts.length; i++) {

            ints[i] = Integer.parseInt(parts[i]);
        }

        for (int i = 0; i <parts.length-1 ; i+=2) {

            if (parts.length%2!=0){
                break;
            }

            if (ints[i]%2 ==0 && ints[i+1]%2 ==0 ){
                System.out.printf("%d, %d -> both are even", ints[i], ints[i+1]);
            }
            if (ints[i]%2 !=0 && ints[i+1]%2 !=0){
                System.out.printf("%d, %d -> both are odd", ints[i], ints[i+1]);
            }
            if ((ints[i]%2 ==0 && ints[i+1]%2 !=0)||(ints[i]%2 !=0 && ints[i+1]%2 ==0)){
                System.out.printf("%d, %d -> diffrent", ints[i], ints[i+1]);
            }

            System.out.println();

        }



    }
}
