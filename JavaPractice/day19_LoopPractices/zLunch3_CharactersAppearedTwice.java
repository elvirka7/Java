package day19_LoopPractices;

import java.util.Scanner;

public class zLunch3_CharactersAppearedTwice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result="";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>=2){
                if(result.contains(""+str.charAt(i))){
                    continue;
                }
                result+=""+str.charAt(i);
            }

        }
        System.out.println(result);


    }

}

/*
Write a program that can display all the characters that appeared twice in the string.
 */