import java.util.Scanner;

/**
 * Write a program that takes as input an integer – the target –
 * and outputs to the console all pairs of numbers between 1 and 20,
 * which, if added or subtracted, result in the target.
 */
public class Hit_the_Target_09 {

    public static void main(String[] args) {

        //enter an integer number target
        Scanner input = new Scanner( System.in );
        System.out.print("Enter an integer target : ");
        int target =Integer.parseInt(input.nextLine());

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20 ; j++) {

                if (i+j == target){
                    System.out.printf("%d + %d = %d", i, j, target);
                    System.out.println();
                }

               // System.out.println();

                if (i-j == target){
                    System.out.printf("%d - %d = %d", i, j, target);
                    System.out.println();
                }

            }

        }
    }
}
