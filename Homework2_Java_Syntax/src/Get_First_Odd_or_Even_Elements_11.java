import java.util.Scanner;

/**
 * Write a method that returns the first N odd/even elements from a collection. Return as many as you can.
 Format: [Get <number of elements> <odd/even>]

 */
public class Get_First_Odd_or_Even_Elements_11 {

    public static String GetElements (int [] ints, int number, String oddEven){

        int k = 0;
        String result = "";

            if (oddEven.equalsIgnoreCase("odd")){

                for (int i = 0; i <ints.length ; i++) {

                    if (ints[i] % 2 != 0) {
                        result = result + ints[i] + " ";
                        k++;
                        if (k == number) {
                            break;
                        }
                    }
                }
            }

            if(oddEven.equalsIgnoreCase("even")){

                for (int i = 0; i <ints.length ; i++) {
                    if (ints[i] % 2 == 0) {
                        result = result + ints[i] + " ";
                        k++;
                        if (k == number) {
                            break;
                        }
                    }
                }
            }

        return result;
    }

    public static void main(String[] args) {
        //enter collection of integer numbers as input string, where int's are separated by white space
        Scanner input = new Scanner( System.in );
        System.out.print("Enter integer numbers separated by white space: ");
        String string =input.nextLine();
        //split the string to parts, separated by white space:
        String[] parts = string.split(" ");

       //converst string parts to integer numbers - ints[] is an array of int's
        int [] ints = new int [parts.length];
        for (int i = 0; i <parts.length; i++) {
            ints[i] = Integer.parseInt(parts[i]);
        }

        //enter collection of integer numbers as input string, where int's are separated by white space
        Scanner input2 = new Scanner( System.in );
        System.out.print("Enter command: ");
        String commandRow =input2.nextLine();
        //split the string to parts, separated by white space:
        String[] partsCommand = commandRow.split(" ");
        int number = Integer.parseInt(partsCommand[1]);
        String oddEven = partsCommand[2];

        System.out.println(GetElements (ints,number, oddEven));

    }
}
