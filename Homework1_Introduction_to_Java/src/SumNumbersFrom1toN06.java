/**
 * Create a Java program that reads a number N from the console and
 * calculates the sum of all numbers from 1 to N (inclusive).
 */
import java.util.Scanner;

public class SumNumbersFrom1toN06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = 0; i <= number; i++) {

            sum+=i;
        }

        System.out.println(sum);
    }
}
