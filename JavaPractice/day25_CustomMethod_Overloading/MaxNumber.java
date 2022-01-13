package day25_CustomMethod_Overloading;

public class MaxNumber {
    public static void main(String[] args) {

    }

    public static int maxNumberFromArray(int[] arrayOfNumbers) {
        int max = arrayOfNumbers[0];
        for (int number : arrayOfNumbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static double maxNumberFromArray(double[] arrayOfNumbers) {
        double max = arrayOfNumbers[0];
        for (double number : arrayOfNumbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static long maxNumberFromArray(long[] arrayOfNumbers) {
        long max = arrayOfNumbers[0];
        for (long number : arrayOfNumbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static short maxNumberFromArray(short[] arrayOfNumbers) {
        short max = arrayOfNumbers[0];
        for (short number : arrayOfNumbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static float maxNumberFromArray(float[] arrayOfNumbers) {
        float max = arrayOfNumbers[0];
        for (float number : arrayOfNumbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static byte maxNumberFromArray(byte[] arrayOfNumbers) {
        byte max = arrayOfNumbers[0];
        for (byte number : arrayOfNumbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
}
/*
   1. create a method that can return the max number from an integer array

    2. create a method that can return the max number from double array

    3. create a method that can return the max number from long array

    4. create a method that can return the max number from short array

    5. create a method that can return the max number from float array

    6. create a method that can return the max number from byte array
 */