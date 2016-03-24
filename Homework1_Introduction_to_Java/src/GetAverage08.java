/**
 * Create a method that finds the average of three numbers.
 * Read in internet about java methods. Check the naming conventions.
 * Invoke your method and test it. Format the output to two digits after the decimal separator.
 * The placeholder is %.2f
 */
public class GetAverage08 {

    public static void average(double a, double b, double c){
        double average = (a+b+c)/3;

        System.out.println(String.format("%.2f",average));
    }

    public static void main(String[] args) {
        average(1.5, 2.5, 3.8);
        average(12,  13, 25);
        average(0.005, 0.5, 0.55);
        average(0, 0, 2);

    }
}
