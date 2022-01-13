package day25_CustomMethod_Overloading;

public class MinNumber {

    public static void main(String[] args) {
        
    }

    public static int minNumberFromArray(int[] arrayOfNumbers) {
        int min = arrayOfNumbers[0];
        for (int number : arrayOfNumbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    public static double minNumberFromArray(double[] arrayOfNumbers) {
        double min = arrayOfNumbers[0];
        for (double number : arrayOfNumbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    public static long minNumberFromArray(long[] arrayOfNumbers) {
        long min = arrayOfNumbers[0];
        for (long number : arrayOfNumbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    public static short minNumberFromArray(short[] arrayOfNumbers) {
        short min = arrayOfNumbers[0];
        for (short number : arrayOfNumbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    public static float minNumberFromArray(float[] arrayOfNumbers) {
        float min = arrayOfNumbers[0];
        for (float number : arrayOfNumbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    public static byte minNumberFromArray(byte[] arrayOfNumbers) {
        byte min = arrayOfNumbers[0];
        for (byte number : arrayOfNumbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }
}
/*
    1. create a method that can return the min number from an integer array

    2. create a method that can return the min number from double array

    3. create a method that can return the min number from long array

    4. create a method that can return the min number from short array

    5. create a method that can return the min number from float array

    6. create a method that can return the min number from byte array

 */