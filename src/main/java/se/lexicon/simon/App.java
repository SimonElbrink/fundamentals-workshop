package se.lexicon.simon;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        //calling a method inside a method. add() returns the result of the calculation.
        System.out.println(add(30, 20));

    }

    public static int add(int number1, int number2){

        // creating a result, with no value.
        int result;

        //Adding number1 & number2 and saving it as result.
        result = number1 + number2;

        //Sending back the result of calculation.
        return result;
    }


}
