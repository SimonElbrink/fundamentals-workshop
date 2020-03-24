package se.lexicon.simon.workshop.week7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<String> stringPredicate = (str1) -> str1.contains("s");

        if (stringPredicate.test("shej")) {
            System.out.println("Success!");
        } else {
            System.out.println("Does not Start with s");
        }

        List<String> strings = new ArrayList<>();
        strings.add("Robin");
        strings.add("Mark");
        strings.add("Carl");
        strings.add("Tobias");
        strings.add("Elmira");
        strings.add("Adam");
        strings.add("Ludwig");

        List<String> result = getValidStrings(strings, (s -> s.contains("a")));

        System.out.println(result);

    }

    public static List<String> getValidStrings(List<String> strings, Predicate<String> predicate) {

        List<String> stringList = new ArrayList<>();

        for (String s : strings) {

            if (predicate.test(s)) {

                stringList.add(s);
            }
        }

        return stringList;
    }
}