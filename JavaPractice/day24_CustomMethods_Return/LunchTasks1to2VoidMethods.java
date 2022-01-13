package day24_CustomMethods_Return;

public class LunchTasks1to2VoidMethods {
    public static void main(String[] args) {

        uniqueCharacters("AABCCD");

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};
        uniqueElements(words);

    }
    public static void uniqueCharacters(String str) {
        String result = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);

    }
    public static void uniqueElements(String[] words) {
        for (int j = 0; j < words.length; j++) {

            String element = words[j]; //"Java"
            int frequency = 0;
            for (int i = 0; i < words.length; i++) { // finds the frequency of element from array
                if (words[i].equals(element)) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.println(element);
            }

        }
    }

}
/*
1. create a method that can display the unique characters of a string

2. create a method that can display the unique elements of array
 */