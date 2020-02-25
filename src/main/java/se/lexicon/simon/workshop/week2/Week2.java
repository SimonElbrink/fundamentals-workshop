package se.lexicon.simon.workshop.week2;

import java.util.Arrays;

public class Week2 {

    public static void main(String[] args){

        // One way to create a array and assigning values.
/*        char[] letters = new char[19];
            letters[0] = 'T';
            letters[1] = 'h';
            letters[2] = 'i';
            letters[3] = 's';
            letters[4] = ' ';
            letters[5] = 'i';
            letters[6] = 's';
            letters[7] = ' ';
            letters[8] = 'a';
            letters[9] = ' ';
            letters[10] = 's';
            letters[11] = 'e';
            letters[12] = 'n';
            letters[13] = 't';
            letters[14] = 'e';
            letters[15] = 'n';
            letters[16] = 'c';
            letters[17] = 'e';
            letters[18] = '.';
*/

        // Another way to create a array and assign values.
        //char[] letters = new char[] {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 's', 'e', 'n', 't', 'e', 'n', 'c', 'e', '.'};

        // A third way to create a array and assign values.
        char[] letters = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 's', 'e', 'n', 't', 'e', 'n', 'c', 'e', '.'};

        System.out.println("letters: " + Arrays.toString(letters));

        //_______________________________________________________________________________

        String sentence = "This is a sentence.";
        System.out.println("sentence: " + sentence);

        String sentenceOfCharArray = "";
        System.out.println("sentenceOfCharArray: " + sentenceOfCharArray);
/*
        for (int i = 0; i < letters.length; i++){
            sentenceOfCharArray = sentenceOfCharArray + letters[i];
        }
*/

        // both for-loops have similar functionality. Two ways of doing similar things.
        for (char character : letters) {
            sentenceOfCharArray = sentenceOfCharArray + character;
        }

        System.out.println("sentenceOfCharArray After loop: " + sentenceOfCharArray);

        int[] numbers = {23,658,355,55,2332122};
        int valueFoundOnIndex = indexOf( numbers, 355);
        System.out.println("Value found on index: " + valueFoundOnIndex);

    }

    //
    /**
     * A method with name indexOf with two params and returns the index of the value if found, else returns -1.
     * @param source The array to find item in.
     * @param value the number to find in the array.
     * @return index of the found value. if value not present returns -1.
     */
    public static int indexOf(int[] source, int value){

        Arrays.sort(source);

        int valueIndex = Arrays.binarySearch(source, value);

        if(valueIndex >= 0){
            return valueIndex;
        }else{
            return -1;
        }
    }


}
