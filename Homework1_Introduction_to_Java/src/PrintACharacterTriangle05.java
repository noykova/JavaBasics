import java.util.Scanner;

/**
 * Created by Sonic on 11-Mar-16.
 */
public class PrintACharacterTriangle05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= number ; i++) {

            //ASCII table: (char)97 = 'a'
            for (char j = 'a'; j < (char) (97+i); j++) {

                System.out.print(j + " ");
            }

            System.out.println();
        }

        for (int i = number-1; i > 0 ; i--) {

            //ASCII table: (char)97 = 'a'
            for (char j = 'a'; j < (char) (97+i); j++) {

                System.out.print(j + " ");
            }

            System.out.println();

        }
    }
}
