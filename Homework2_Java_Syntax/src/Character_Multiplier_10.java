/**
 * Create a method that takes two strings as arguments
 * and returns the sum of their character codes multiplied (multiply str1.charAt (0) with str2.charAt (0)
 * and add to the total sum).
 * Then continue with the next two characters.
 * If one of the strings is longer than the other,
 * add the remaining character codes to the total sum without multiplication.
 */
public class Character_Multiplier_10 {

    public static int sumMultipliedChars(String str1,String str2){
        int sum =0;
        if (str1.length()==str2.length()){

            for (int i = 0; i <str1.length() ; i++) {
                sum = sum + str1.charAt(i)*str2.charAt(i);
            }
            return sum;
        }
        if (str1.length()<str2.length()){

            for (int i = 0; i <str1.length(); i++) {

                sum = sum + str1.charAt(i)*str2.charAt(i);
            }

            for (int i = str1.length(); i < str2.length(); i++) {

                sum = sum + str2.charAt(i);
            }

            return sum;
        }
        if (str2.length()<str2.length()){

            for (int i = 0; i <str2.length(); i++) {

                sum = sum + str1.charAt(i)*str2.charAt(i);
            }

            for (int i = str2.length(); i < str1.length(); i++) {

                sum = sum + str1.charAt(i);
            }

            return sum;
        }
     return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumMultipliedChars("Gosho","Pesho"));
        System.out.println(sumMultipliedChars("123","522"));
        System.out.println(sumMultipliedChars("a","aaaa"));

    }
}
