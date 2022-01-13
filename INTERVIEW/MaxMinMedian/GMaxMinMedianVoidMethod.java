package MaxMinMedian;

public class GMaxMinMedianVoidMethod {
    public static void main(String[] args) {

    int [] numbers = {1,2,3,4,5};
        maxMinMed(numbers);

        }
    public static void maxMinMed(int [] array){
        int max = array[0];
        int min = array[0];
        int sum=0;
        for (int each : array) {
            if(max<each){
                max=each;
            } else if(min>each){
                min = each;
            }
            sum+=each;
        }
        int median = sum/array.length;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("median = " + median);

    }
}
