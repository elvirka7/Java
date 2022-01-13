package practice_12_29_2021;

import java.util.Arrays;

public class DoubleArray {

    public static void main(String[] args) {

        double[] doub = new double[4];
        doub[0] = 1.0;
        doub[2] = 42.1;
        doub = new double[4]; //creating new doub array
        doub[1] = 17.2;
        doub[3] = doub.length;

        System.out.print(Arrays.toString(doub));
    }
}
