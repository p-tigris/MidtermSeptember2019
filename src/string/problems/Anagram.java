package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

    }


    public static boolean isAnagram(char[] str1, char[] str2) {

            if (str1.length != str2.length)
                return false;

            Arrays.sort(str1);
            Arrays.sort(str2);

            for (int i = 0; i < str1.length; i++)
                if (str1[i] != str2[i])
                    return false;

            return true;
        }
    }
