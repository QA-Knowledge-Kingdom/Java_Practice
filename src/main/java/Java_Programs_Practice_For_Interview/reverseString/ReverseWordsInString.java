/**
 * Date : 29-09-2024
 * Email - QAknowledgeKingdom@gmail.com
 */


package Java_Programs_Practice_For_Interview.reverseString;

public class ReverseWordsInString {
    public static void main(String[] args) {


        String str = "Learn Java Programming for Interview";

        String[] strings = str.split(" ");
        String newString = "";

            for (int i = strings.length-1;i>=0;i--){

                if (!newString.isEmpty()){
                    newString = newString+ " ";
                }
                newString = newString+strings[i];

        }
        System.out.println(str);
        System.out.println(newString);

    }
}
