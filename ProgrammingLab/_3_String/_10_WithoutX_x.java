package _3_String;

import java.util.Scanner;

public class _10_WithoutX_x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODES

        if(word.substring(0,1).equalsIgnoreCase("x") && word.substring(word.length()-1).equalsIgnoreCase("x")) {
            word = word.substring(1, word.length()-1);
    } else if (word.substring(0,1).equalsIgnoreCase("x")){
         word = word.substring(1);
        } else if (word.substring(word.length()-1).equalsIgnoreCase("x")){
            word = word.substring(0,word.length()-1);
        }  else {
            word = word;
        }
        System.out.println(word);

        scan.close();
        }


}




/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,
otherwise print the string unchanged.

Example:

input: xHiX

output: Hi

input: apple
output: apple
input: xUxL
output: UxL
input: JavaX
output: Java
 */