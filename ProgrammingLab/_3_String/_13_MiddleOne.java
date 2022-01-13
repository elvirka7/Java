package _3_String;

import java.util.Scanner;

public class _13_MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:

        if(word.length()%2!=0) {
            if (word.length() >= 3) {
                System.out.println(word.substring(word.length() / 2, word.length() / 2 + 1));
            } else if (word.length() == 1) {
                System.out.println(word.repeat(3));
            }
        } else if (word.length()%2==0){
            if(word.length() >=4){
                System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
            } else if(word.length()==2){
                System.out.println(word.repeat(2));
            }

        }
        scan.close();
    }
}
/*
You have a word, do the following:

When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a
      javav ==> v
Single character, print that character 3 times
      # ==> ###
      q ==> qqq
When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av
copied!
     apples ==> pl
     #$%^&* ==> %^
2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */