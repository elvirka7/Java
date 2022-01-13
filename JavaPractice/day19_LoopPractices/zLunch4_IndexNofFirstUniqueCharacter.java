package day19_LoopPractices;

public class zLunch4_IndexNofFirstUniqueCharacter {
    public static void main(String[] args) {

        String str = "lllammmmmm";
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    result = str.indexOf(str.charAt(i));
                    count++;
                }
            }
            if (count == 1) {
                break;
            }

        }

        System.out.println(result);

    }
}
/*
Write a program that can return the index number of the first unique character.
 */