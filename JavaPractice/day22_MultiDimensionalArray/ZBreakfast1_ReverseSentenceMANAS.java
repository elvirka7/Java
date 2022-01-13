package day22_MultiDimensionalArray;

public class ZBreakfast1_ReverseSentenceMANAS {
    public static void main(String[] args) {

        String str = "Today is a good day to learn Java";
        String[] strSplit = str.split(" ");
        String strReverse = "";

        for (String each : strSplit) {
            strReverse = each + " " + strReverse;
        }
        System.out.println(strReverse);
    }
}
/*
Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today
 */