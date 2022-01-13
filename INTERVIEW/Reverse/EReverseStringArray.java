package Reverse;

import java.util.Arrays;

public class EReverseStringArray {
    public static void main(String[] args) {

        String [] array = { "Grant", "Elvira", "Kai", "Alia"};
        String[] reverse = new String[array.length];

        int j =0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        System.out.println("Array is "+ Arrays.toString(array));
        System.out.println("Reversed array "+Arrays.toString(reverse));

    }
}
