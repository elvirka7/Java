package day10_NestedIf;


public class NumberPositiveOrNegative {
    public static void main(String[] args) {
        int number=0;
        String result = (number>0)? "Positive" :(number<0)? "Negative" : "Zero";
        System.out.println(result);
    }
}