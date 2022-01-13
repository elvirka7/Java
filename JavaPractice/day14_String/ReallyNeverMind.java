package day14_String;

import java.util.Scanner;

public class ReallyNeverMind {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = sc.next(), result = "";
        sc.close();

         if(word.length()>=2) {
             if (word.substring(word.length() - 2).equals("ly")) {      // OR   ("" + word.charAt(a - 2) + word.charAt(a - 1)).equals("ly")) {
                 result = "really???";
             } else {
                 result = "never mind";
             }
         } else {
             result = "Invalid input";
         }

        System.out.println(result);
        }
    }

/*
ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */