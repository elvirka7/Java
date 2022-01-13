package utilities;

import java.util.Arrays;

public class StringUtility {


    //prints each character of the given string in a separate line
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }


    //reverses the given string and returns the reversed string
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    //checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverse(str));
    }

    //checks if the given string is anagram, returns boolean
    public static boolean isAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);

    }

    //removes the duplicates from the given string, returns String.     "aaaabbbbbccc" ===> "abc"
    public static String removeDuplicates(String str){
        String newString ="";

        for (int i = 0; i < str.length(); i++) {
            if(!(newString.contains(""+str.charAt(i)))){    //if new String does not contain original string characters, it starts adding it to new string, so duplicates are not added
                newString+=str.charAt(i);
            }
        }
        return newString;
    }
}
