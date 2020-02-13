package se.lexicon.simon;

/**
 * Hello world!
 *
 */
public class App
{

    // creating variables, with default values
    public static int result;
    public static String name;

    public static void main( String[] args )
    {

        System.out.println("Before calculation: ");
        System.out.println(result);

        //calling a method inside a method. add() returns the result of the calculation.
        System.out.println(add(30, 20));

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
