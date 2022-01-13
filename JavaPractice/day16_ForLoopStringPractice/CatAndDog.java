package day16_ForLoopStringPractice;

public class CatAndDog {
    public static void main(String[] args) {

String sentence = "caT dog dogG cAt";
int dogCount = 0;
int catCount = 0;
        for (int i = 0; i < sentence.length()-1; i++) {
            if(sentence.toLowerCase().substring(i).startsWith("dog")){
                ++dogCount;
            } else if(sentence.toLowerCase().substring(i).startsWith("cat")){
                ++catCount;
            }

        }
        System.out.println(dogCount==catCount);

    }
}
/*
write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */