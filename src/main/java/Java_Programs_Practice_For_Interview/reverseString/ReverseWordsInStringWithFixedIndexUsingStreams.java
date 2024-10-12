package Java_Programs_Practice_For_Interview.reverseString;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Date : 28-09-2024
 * Email - qaknowledgekingdom@gmail.com
 */


public class ReverseWordsInStringWithFixedIndexUsingStreams {
    public static void main(String[] args) {

        // Input -  Learn Java Programming for Interview
        // Output - nraeL avaJ gnimmargorP rof weivretnI

        /*
                            Solution
           1. Converting given String into String Array
           2. Taking each word from the String Array and revering the word
           3. Storing revered Words into String
         */

        String str = "Learn Java Programming for Interview";
        System.out.println(str);

        String reversedString =   Arrays.stream(str.split(" "))
                                        .map(word -> new StringBuilder(word).reverse())
                                        .collect(Collectors.joining(" "));
        System.out.println(reversedString);









    }

}
































