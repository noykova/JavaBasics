import java.util.Scanner;

/**
 * Write a program that reads three floating point numbers from the console
 * and calculates their result with the following formulae:
 ((a2 + b2) / (a2 – b2))(a + b + c) / √c
 (a2 + b2 - c3)(a – b)
 Then calculate the difference between the average of the three numbers and the average of the two formulae.
 Average (a, b, c) – Average (f1, f2)

 */
public class Calculate_expression_04 {


    public static void main(String[] args) {
        //read numbers a, b, c
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double power = (a+b+c)/Math.sqrt(c);
        //calculate F1 and F2
        double f1 = Math.pow((a*a+b*b)/(a*a-b*b),power);
        double f2 = Math.pow((a*a+b*b-c*c*c),(a-b));
        //calculate the two averages
        double av1 = (a+b+c)/3;
        double av2 = (f1+f2)/2;
        //calculate the difference
        double result = Math.abs(av1 - av2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1,f2,result);



    }
}
