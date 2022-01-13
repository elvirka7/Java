package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        array = addInteger(array, 5);
        System.out.println(Arrays.toString(array));

        double[] array2 = {1.5, 2.5, 3.5, 4.5};
        array2 = addDouble(array2, 5.5);
        System.out.println(Arrays.toString(array2));

        char[] array3 = {'a', 'b', 'c', 'd'};
        array3 = addChar(array3, 'e');
        System.out.println(Arrays.toString(array3));
        
        String[] names = {"Grant", "Elvira", "Kai"};
        names = addString(names, "Alia");
        System.out.println(Arrays.toString(names));

    }

    //1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;
        return result;
    }

    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[i] = element;
        return result;
    }

    //3. create a return method called addString that can add a String after last index of a String array
    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;
        return result;
    }
    
    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addChar(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[result.length-1] = element; // element need to be assigned to the last index
       // result[i] = element;
        return result;
    }
}
