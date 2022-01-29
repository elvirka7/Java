package practice_01_26_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Q27 {

    public static void main(String[] args) {

        String[] cities= {"Boston", "Houston", "Austin", "Lincoln", "Tulsa"};
                         // "Boston", "Houston", "Austin", "Lincoln", "notsoB"
                         // "Boston", "Houston", "Austin", "notsuoH" ,"notsoB"
                         // "Boston", "Houston", "nitsuA" , "notsuoH" ,"notsoB"
                         // "Boston", "Houston", "nitsuA" , "notsuoH" ,"notsoB"
                         // "Boston", "Houston", "nitsuA" , "notsuoH" ,"notsoB"
        ArrayList<String> list = new ArrayList(Arrays.asList(cities));

        System.out.println(list);

        int a = list.size(); //5

        for (String str: list){
            String rev = "";

            for(int i = str.length()-1; i >= 0; i--){
                rev += str.charAt(i); // notsoB
            }
            list.set(--a, rev); // 0
            // set() is changing the specific index of elements and because of this your list is changing as well

            System.out.println(list);
        }
        System.out.println(list);



    }
}
