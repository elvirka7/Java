package day16_ForLoopStringPractice;

public class CatAndDogForLoop {
    public static void main(String[] args) {

        String sentence = "caT dog dogG cAt dog cat";
        int dogCount = 0;
        int catCount = 0;

        for (int i = 0; i <= sentence.length() - 3; i++) {
            if (sentence.substring(i, i + 3).equalsIgnoreCase("dog")) {
                ++dogCount;
            } else if (sentence.substring(i, i + 3).equalsIgnoreCase("cat")) {
                ++catCount;
            }
        }
        System.out.println(dogCount == catCount);

    }
}
/*
write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */