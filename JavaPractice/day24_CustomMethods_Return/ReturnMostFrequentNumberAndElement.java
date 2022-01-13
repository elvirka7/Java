package day24_CustomMethods_Return;

public class ReturnMostFrequentNumberAndElement {
    public static void main(String[] args) {

        int[] arr =  {1,1,1,1,1,2,3,4,5};
        String mostFrequent = mostFrequentNumber(arr);
        System.out.println(mostFrequent);
    }

    public static String mostFrequentNumber(int[] arr) {
        int mostFrequent = 0;
        int mostFrequentNumber = 0;
        int number = 0;
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            int each = arr[i];
            int count = 0;


            for (int j = 0; j < arr.length; j++) {
                int element = arr[j];
                if (each == element) {
                    count++;
                }
            }


            if (result.contains("" + each)) {
                continue;
            }


            if (count > mostFrequent) {
                mostFrequent = count;
                mostFrequentNumber = each;
                number = count;
            }


            result = "The most frequent number is: "+ mostFrequentNumber+"\nThe frequency is: "+number;


        }

        return result;
    }
}

