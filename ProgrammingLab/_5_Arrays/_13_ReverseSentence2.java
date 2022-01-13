package _5_Arrays;

import java.util.Scanner;

public class _13_ReverseSentence2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: start your code here
        String reversed = "";
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        System.out.println(reversed);
        input.close();
    }
}
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
 */