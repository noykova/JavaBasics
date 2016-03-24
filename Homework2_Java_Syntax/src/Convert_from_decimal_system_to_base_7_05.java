import java.util.Scanner;

/**
 * Created by Sonic on 19-Mar-16.
 */
public class Convert_from_decimal_system_to_base_7_05 {

    public static void main(String[] args) {

        //read decimal number num
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a decimal number: ");
        int num =input.nextInt();


        /* Here we write a logic for decimal to base - 7 conversion*/

        // For storing remainder
        int rem;

        // For storing result
        String str="";

        // Digits in base - 7 number system
        char dig[]={'0','1','2','3','4','5','6'};

        while(num>0)
        {
            //divide the number to 7 and take the remainder.
            rem=num%7;
            str=dig[rem]+str;
            //the result from division (int part) is now the new number
            num=num/7;
        }
        System.out.println("Decimal to base-7: "+str);


    }
}
