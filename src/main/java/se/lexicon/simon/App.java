package se.lexicon.simon;

/**
 * Hello world!
 *
 */
public class App
{

    // creating variables, with default values
    public static int number1 = 30;
    public static int number2 = 20;
    public static int result;
    public static String name;

    public static void main( String[] args )
    {

        System.out.println("Before calculation: ");
        System.out.println(result);

        // Using our add method, and saving the result
        result = add(number1, number2);

        System.out.println("After calculation: ");
        System.out.println(result);

        // Print out name
        System.out.println(name);
    }

    public static int add(int number1, int number2){

        // creating a result, with no value.
        int result;

        //Calculating
        result = number1 + number2;

        //Sending back the result of calculation.
        return result;
    }


}
