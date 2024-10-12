/**

 * Date : 29-09-2024
 * Email - QAknowledgeKingdom@gmail.com
 */


package Java_Programs_Practice_For_Interview.reverseString;


import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInStringUsingStreams {

    public static void main(String[] args) {
        String str = "Learn Java Programming for Interview";

        String reversing =  Arrays.stream(str.split(" ")).sorted((a,b) -> -1)
                .collect(Collectors.joining(" "));

        System.out.println(str);
        System.out.println(reversing);

































//        String reverseString = Arrays.stream(str.split(" "))
//                                .sorted((a,b) ->-1)
//                                .collect(Collectors.joining(" "));
//
//        System.out.println(str);
//        System.out.println(reverseString);
    }
}
