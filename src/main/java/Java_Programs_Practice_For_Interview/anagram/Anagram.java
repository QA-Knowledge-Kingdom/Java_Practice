/**
 * Date : 04-10-2024
 * Email - QAknowledgeKingdom@gmail.com
 */


package Java_Programs_Practice_For_Interview.anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String result =  findAnagram("listen","tensil");
        System.out.println(result);
    }

    public static String findAnagram(String a, String b){

        boolean flag = true;


        if (a.length()!=b.length()){
            return "Not a Anagram";
        }else {

            char[] cha = a.toCharArray();
            char[] chb = b.toCharArray();
            System.out.println("--------Print Words--------");
            System.out.println(a);
            System.out.println(b);


            Arrays.sort(cha);
            Arrays.sort(chb);

            System.out.println("--------Print Sorted Array--------");
            for (char c : cha){
                System.out.print(c);
            }
            System.out.println();
            for (char c : chb){
                System.out.print(c);
            }

            System.out.println();
            System.out.println("--------Print Result--------");

            for (int i =0;i<cha.length;i++){

                if (cha[i]!=chb[i]){
                    flag = false;
                }
            }

        }
        if (flag!=true){
            return "Not A Anagram";
        }else
            return  "Anagram";


    }

}
