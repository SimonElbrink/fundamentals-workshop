package se.lexicon.simon;


import se.lexicon.simon.workshop.week4.calculator.CalculatorImpl;

public class App {

    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();

        System.out.println(calculator.calculate(10,20,'+'));



    }
}
