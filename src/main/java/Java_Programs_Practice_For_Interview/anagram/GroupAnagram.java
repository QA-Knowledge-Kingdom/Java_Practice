/**

 * Date : 03-10-2024
 * Email - QAknowledgeKingdom@gmail.com
 */


package Java_Programs_Practice_For_Interview.anagram;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate","tae", "nat", "bat"};

        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for (String str : words){ //eat, tea,  tan, ate

            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String newString = new String(ch); // aet, ant
            anagramMap.computeIfAbsent(newString, k -> new ArrayList<>()).add(str);
        }

        System.out.println(anagramMap);

        for (Map.Entry key : anagramMap.entrySet()){
            System.out.println(key.getValue());
        }

    }}
