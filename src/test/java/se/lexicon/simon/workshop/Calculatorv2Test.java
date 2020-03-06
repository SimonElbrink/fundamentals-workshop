package se.lexicon.simon.workshop;

import org.junit.Assert;
import org.junit.Test;
import se.lexicon.simon.workshop.calculatorv2.CalculatorImpl;

public class Calculatorv2Test {


    @Test
    public void test_addition(){
        //Arrange
        CalculatorImpl calculator= new CalculatorImpl();

        double num1 = 10;
        double num2 = 20;
        double actual;

        double expected = 30;

        //Act
        actual = calculator.addition(num1, num2);

        //Assert
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void test_calculate(){
        //Arrange
        CalculatorImpl calculator= new CalculatorImpl();
        char operator = '+';

        double num1 = 10;
        double num2 = 20;
        double actual;

        double expected = 30;

        //Act
        actual = calculator.calculate(num1, num2, operator);

        //Assert
        Assert.assertEquals(expected, actual, 0.01);

    }


}
