package se.lexicon.simon.workshop.week1; // Package MOST be at line 1.


/*
TODO if-statement, switch, while, do-While, for-loop,
 methods(1. no return, no params. 2. have return, no params. 3. no return, have param. 4. have return, have params.)
 */
public class Week1 { //Start of Class

    /*
    Main method, the method that runs our project.
    Our program lives and dies in the main.
    if you don't mention it in some form in main it won't happened.
    */
    public static void main( String[] args ) //This is a syntax of how you could write a main method.
    { //Start of main method.

        //Printing out the value of add method. Calling a method inside our sys-out method.
        //This is just for showing it in action. THIS IS NOT A TEST.
        System.out.println(add(30, 20));

    } // End of main method

    public static int add(int number1, int number2){
        // creating "result" as int, with no value.
        int result;

        //Adding number1 & number2 and saving it as result.
        result = number1 + number2;

        //Sending back the result of calculation.
        return result;
    }

    public static boolean isAdult(int age){ // Start of isAdult method

        //Creating and assigning ageWhenAdult the value to validate as a adult, saving the value as int.
        int ageWhenAdult = 18;

        //Validates if age is equal or older then set age restriction, returns the result.
        if(age >= ageWhenAdult) {
            return true;
        } else { //This line specifies the... 1.Closing of "if" statement. 2.Uses the keyword "else" to specify what to do in all other cases when above statements (if-statement) are not valid. 3. Open's "else" scope.
            return false;
        } //End of else statement
    } // End of method


} // End of class
