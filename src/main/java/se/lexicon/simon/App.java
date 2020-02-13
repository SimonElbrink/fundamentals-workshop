package se.lexicon.simon;

/**
 * Hello world!
 *
 */
public class App
{

    // creating variables, with default values
    public static int number1;
    public static int number2;
    public static int result;
    public static String name;

    public static void main( String[] args )
    {
        // Using our add method
        add();

        // Print out name
        System.out.println(name);
    }

    public static void add(){
        System.out.println("Before calculation: ");
        System.out.println(result);

        //Calculating
        result = number1 + number2;

        System.out.println("After calculation: ");
        System.out.println(result);
    }


}
