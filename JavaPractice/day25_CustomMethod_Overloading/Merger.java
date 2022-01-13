package day25_CustomMethod_Overloading;

public class Merger {
    public static void main(String[] args) {


    }


    public static int[] merger(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int newIndex = 0;
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[newIndex++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[newIndex++] = arr2[i];
        }
        return mergedArray;
    }

    public static double[] merger(double[] arr1, double[] arr2) {
        double[] mergedArray = new double[arr1.length + arr2.length];
        int newIndex = 0;
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[newIndex++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[newIndex++] = arr2[i];
        }
        return mergedArray;
    }

    public static char[] merger(char[] arr1, char[] arr2) {
        char[] mergedArray = new char[arr1.length + arr2.length];
        int newIndex = 0;
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[newIndex++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[newIndex++] = arr2[i];
        }
        return mergedArray;
    }

    public static String[] merger(String[] arr1, String[] arr2) {
        String[] mergedArray = new String[arr1.length + arr2.length];
        int newIndex = 0;
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[newIndex++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[newIndex++] = arr2[i];
        }
        return mergedArray;
    }

}
/*
  1. create a method that can merge two integer arrays.          merger(int[] arr1, int[] arr2)

    2. create a method that can merge two double arrays.          merge(double[] arr1, double[] arr2)

    3. create a method that can merge two char arrays.           merge(char[] arr1, char[] arr2)

    4. create a method that can merge two String arrays.          merge(String[] arr1, String[] arr2)

 */