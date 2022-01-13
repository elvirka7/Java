package day24_CustomMethods_Return;

public class ReturnMostFrequentNumberAndElementMANAS {
    public static void main(String[] args) {

        // Most Frequent element from array and frequency number
        int[] arr = {1,1,1,1,1,1,1,2,3,4,5,5,5,5,5,5,5,5,5,5};
        int[] result= mostFrequentElementAndCount(arr); // Result arrays of 2. First most frequent element, second frequency of that element
        System.out.println("Most frequent element from array: " + result[0] + ", has frequency of: " + result[1]);
    }

    // Most Frequent element from array and frequency number
    public static int[] mostFrequentElementAndCount(int[] arr) {
        int[] result = new int[2];
        int count = 0;
        int most = 0;
        for (int each : arr) {
            count = 0;
            for (int sub : arr) {
                if (each == sub) {
                    count++;
                }
            }
            if (count > most) {
                most = count;
                result[0] = each;
                result[1] = count;
            }
        }
        return result;
    }
}

