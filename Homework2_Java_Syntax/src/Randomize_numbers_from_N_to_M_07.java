import java.util.Random;
import java.util.Scanner;

/**
 * Write a program that takes as input two integers N and M,
 * and randomizes the numbers between them.
 * Note that M may be smaller than or equal to N.
 */
public class Randomize_numbers_from_N_to_M_07 {

    public static void main(String[] args) {

    //enter the numbers N and M
        Scanner input = new Scanner( System.in );
        System.out.print("Enter an int number N: ");
        int n =Integer.parseInt(input.nextLine());
        System.out.print("Enter an int number M: ");
        int m =Integer.parseInt(input.nextLine());

        //check which number is smaller and change the places if M < N

        if (n>m){

            int temp;
            temp = n;
            n=m;
            m = temp;
        }


        //print (n-m+1) random numbers:
        Random rand = new Random();
        for (int i = 0; i <=(m-n); i++) {
            //m is the maximum and n is our minimum
            //if we need to generate numbers from min to max (including both), we write:
            //random.nextInt(max - min) + min
            int random = rand.nextInt(m-n+1) + n;
            System.out.print(random + " ");
        }

    }
}
