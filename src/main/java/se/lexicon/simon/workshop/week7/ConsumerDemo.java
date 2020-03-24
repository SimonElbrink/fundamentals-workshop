package se.lexicon.simon.workshop.week7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        //Connected with example 2
        Consumer<String> consumer = (str) -> System.out.println(new StringBuilder(str).reverse());

        List<String> strings = new ArrayList<>();
        strings.add("Robin");
        strings.add("Mark");
        strings.add("Carl");
        strings.add("Tobias");
        strings.add("Elmira");
        strings.add("Adam");
        strings.add("Ludwig");

        //First example
        strings.forEach((str) -> System.out.println(new StringBuilder(str).reverse()));

        //Secound Example
        strings.forEach(consumer);

        //Third Example
        strings.forEach(ConsumerDemo::printReverse);

    }

    //Working with Example 3
    public static void printReverse(String s) {
        System.out.println(new StringBuilder(s).reverse());
    }



}
