package day25_CustomMethod_Overloading;

public class Reverse {
    public static void main(String[] args) {

    }

    public static int[] reversedArray(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static double[] reversedArray(double[] array) {
        double[] reverse = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static char[] reversedArray(char[] array) {
        char[] reverse = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static String[] reversedArray(String[] array) {
        String[] reverse = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }
}
/*
    1. Create a method that can reverse an integer array

    2. Create a method that can reverse a double array

    3. Create a method that can reverse a char array

    4. Create a method that can reverse a String array
 */