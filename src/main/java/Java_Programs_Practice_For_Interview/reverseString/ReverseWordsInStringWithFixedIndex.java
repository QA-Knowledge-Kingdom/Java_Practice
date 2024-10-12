package Java_Programs_Practice_For_Interview.reverseString;

/**
 * Date : 28-09-2024
 * Email - qaknowledgekingdom@gmail.com
 */


public class ReverseWordsInStringWithFixedIndex {

    public static void main(String[] args) {

        String str = "Learn Java and Selenium";
        String[] strings = str.split(" ");
        String newString = "";
        for (int i =0;i<strings.length;i++){
                char[] ch = strings[i].toCharArray();
                int len = ch.length;
                for (int j =len-1;j>=0;j--){
                    newString = newString+ch[j];
                }
                newString= newString+" ";
        }
        System.out.println(str);
        System.out.println(newString);

    }
}
