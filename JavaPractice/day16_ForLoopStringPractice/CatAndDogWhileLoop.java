package day16_ForLoopStringPractice;

public class CatAndDogWhileLoop {
    public static void main(String[] args) {

        String sentence = "cat cat cat dog dog dog cat cat";
        int countCat = 0;
        int countDog = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println("countCat = " + countCat);


        while (sentence.contains("dog")) {
            sentence = sentence.replaceFirst("dog", "");
            countDog++;
        }
        System.out.println("countDog = " + countDog);

    }
}
/*
write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */