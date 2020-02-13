package se.lexicon.simon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static se.lexicon.simon.App.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
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
        //Arrange
        int number1 = 20;
        int number2 = 30;
        int expected = 50;
        int actual;

        //Act
        actual = add(number1, number2);

        //Assert
        assertEquals(expected, actual);

    }



}
