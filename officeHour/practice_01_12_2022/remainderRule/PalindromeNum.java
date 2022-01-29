package practice_01_12_2022.remainderRule;

public class PalindromeNum {

    // level

    public static void main(String[] args) {
        System.out.println(isPalNum(545));



    }

    public static boolean isPalNum(int num) {
        // there are two most important things to remember
        // to get most right number, we can do 'num % 10'
        // to remove most right number, we can do 'num / 10'
        // both will work for any numbers

        int copyOfOriginal = num;
        int reversedNumber = 0;
        int remainder;

        while(num > 0) {
            // get most right number
            remainder = num % 10;

            // multiply by 10 to concat, not to add(plus)
            reversedNumber = (reversedNumber * 10) + remainder;

            // remove most right number from num.
            num = num / 10;
        }

        // if reversed version and original are equal so it's palindrome
        return reversedNumber == copyOfOriginal;
    }
}
