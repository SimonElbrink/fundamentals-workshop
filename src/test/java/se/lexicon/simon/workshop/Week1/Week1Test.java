package se.lexicon.simon.workshop.Week1;

import static org.junit.Assert.*;
import static se.lexicon.simon.workshop.week1.Week1.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Week1Test
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_add(){
        //Arrange - Preparing all values for my test.
        int number1 = 20;
        int number2 = 30;
        int expected = 50;
        int actual;

        //Act - Executing what i want to test.
        actual = add(number1, number2);

        //Assert - Checking if my assumption was correct.
        assertEquals(expected, actual);
    }

    @Test
    public void test_isAdult_true(){
        //Arrange
        int age = 18;
        boolean expected = true;
        boolean actual;

        //Act
        actual = isAdult(age);

        //Assert - Alternative 1
        assertEquals(expected, actual);

        //Assert - Alternative 2
        assertTrue(actual);

        //Assert - Alternative 3
        assertTrue(isAdult(age));

        //These Asserts are all correct, three different ways of achieving the same goal.
        // Pick the one you understand. Alternative 1 is most explicit.
    }

    @Test
    public void test_isAdult_false(){

        //Arrange
        int age = 10;
        boolean actual;

        //Act
        actual = isAdult(age);

        //Assert
        assertFalse(actual);

    }

}
