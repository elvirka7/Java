package practice_12_08_2021;

import java.util.Scanner;

public class FirstTwoLetter {

    public static void main(String[] args) {
        /* (substring-length-isEmpty)

				      Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

					          Input :"Hello"   → "He"
					          Input :"abcdefg" → "ab"
					          Input :"a"	     → "a"
					          Input :""	     → "It can not be empty"
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter word.");
        String word=input.nextLine();

        if(word.isEmpty()){
            System.out.println("It can not be empty");
        } else if(word.length()<=2){
            System.out.println(word);
        }else {
            System.out.println(""+word.charAt(0)+word.charAt(1));
           System.out.println(word.substring(0,2));
        }


    }


}
