package practice_01_05_2022;

import java.util.Arrays;
import java.util.Locale;

public class RemoveSpaces {

     /*  (RemoveSpaces)

                      Task 3 :   Write a method that can remove  all extra space from String


    			            Input: "  Hello world      I      love      Java    "
        	               Output: Hello world I love Java

                     */

    public static void main(String[] args) {
        String input= "  Hello world      I      love      Java    ";
        removeSpaces(input);
    }

    public static void removeSpaces(String str){
        String result = "";
        String[] strArr =str.trim().split(" ");
        //System.out.println(Arrays.toString(strArr));

        for(String each : strArr){
            if(!each.isEmpty()){
                result += each+ " ";
            }
        }
        System.out.println(result.trim());

    }
}
