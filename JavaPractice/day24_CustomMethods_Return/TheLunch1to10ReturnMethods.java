package day24_CustomMethods_Return;

import java.util.Arrays;

public class TheLunch1to10ReturnMethods {

    public static void main(String[] args) {

        System.out.println("Task #1");
        int f = frequencyOfWord("Java java java python python", "java");
        System.out.println("Frequency of word : " + f);

        System.out.println("Task #2");
        boolean isAnagram = isAnagram("cba", "abc");
        System.out.println("Is Anagram: " + isAnagram);

        System.out.println("Task #3");
        String reverse = reverse("Java");
        System.out.println("Reverse: " + reverse);

        System.out.println("Task #4");
        boolean isPalindrome = isPalindrome("level");
        System.out.println("Is Palindrome: " + isPalindrome);

        System.out.println("Task #5");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 6, 6, 6, 8, 9};
        int freq = frequencyOfNumber(numbers, 6);
        System.out.println("Frequency of number: " + freq);

        System.out.println("Task #6");
        int[] arr = {1, 2, 3};
        int[] arr2 = addElement(arr, 4);
        System.out.println("New array: " + Arrays.toString(arr2));

        System.out.println("Task #7");
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] mergedArray = merge(array1, array2);
        System.out.println("Merged array of " + Arrays.toString(array1) + " and " + Arrays.toString(array2) + " is " + Arrays.toString(mergedArray));

        System.out.println("Task #8");
        int[] array = {10, 20, 30, 40};
        int[] reverseArray = reverse(array);
        System.out.println("Reversed array of " + Arrays.toString(array) + " is " + Arrays.toString(reverseArray));

        System.out.println("Task #9");
        int[] arra = {1, 2, 3, 4, 5, 6, 7};
        int n = 6;
        System.out.println("Number " + n + " is contained in array " + Arrays.toString(arra) + " : " + isContained(arra, n));

        System.out.println("Task #10");
        int[] arrayOfIntegers = {10, 20, 30, 40, 50, 60};
        int index = 2;
        int[] newArrayOfIntegers = removeElement(arrayOfIntegers, index);
        System.out.println(Arrays.toString(arrayOfIntegers)+" after index # "+index+" has been eliminated: "+Arrays.toString(newArrayOfIntegers));

    }

    public static int frequencyOfWord(String sentence, String word) {
        int frequency = 0;
        for (int i = 0; i <= sentence.length() - word.length(); i++) {
            if (sentence.substring(i, i + word.length()).equalsIgnoreCase(word)) {
                frequency++;
            }
        }
        return frequency;
    }

    public static boolean isAnagram(String str1, String str2) {
        boolean isAnagram;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            isAnagram = true;
        } else {
            isAnagram = false;
        }
        return isAnagram;
    }

    public static String reverse(String str) {

        String reverse = "";
        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            reverse += str.charAt(j);
        }
        return reverse;
    }

    public static boolean isPalindrome(String str) {
        boolean isPalindrome;
        String reverse = "";
        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            reverse += str.charAt(j);
        }
        if (reverse.equals(str)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        return isPalindrome;
    }

    public static int frequencyOfNumber(int[] array, int n) {
        int frequency = 0;
        for (int i : array) {
            if (i == n) {
                frequency++;
            }
        }
        return frequency;
    }

    public static int[] addElement(int[] arr, int n) {
        int j = 0;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[j++] = arr[i];
        }
        newArr[j++] = n;
        return newArr;
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[j++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[j++] = arr2[i];
        }
        return mergedArray;
    }

    public static int[] reverse(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            reverse[i] = arr[j];
        }
        return reverse;
    }

    public static boolean isContained(int[] arr, int n) {
        int count = 0;
        boolean isContained;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        if (count > 0) {
            isContained = true;
        } else {
            isContained = false;
        }
        return isContained;
    }

    public static int[] removeElement(int[] arr, int index) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == index) {
                j--;
                continue;}
                newArray[j] = arr[i];
        }  return newArray;
    }
}
/*
Task #s
	1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3


    2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true


	3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ


	4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true



    5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5


    6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}


	7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}


	8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}


	9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false


	10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */