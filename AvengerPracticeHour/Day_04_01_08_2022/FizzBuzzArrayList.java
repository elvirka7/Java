package Day_04_01_08_2022;

import java.util.ArrayList;

public class FizzBuzzArrayList {
    /**
     * Q5:
     *        - Write a program that returns a list of strings between two numbers
     *        but
     *        for multiples of 3 insert "Fizz" instead of number
     *        for multiples of 5 insert "Buzz" instead of number
     *        for multiples of 3 and 5 insert "FizzBuzz" instead of number
     *
     *        - You will also need to create a divisibleBy method that accepts two integer number and return a boolean.
     *
     *        Input: fizzBuzzGenerator(1,15);
     *        Output: ["1","2","Fizz","4","Buzz",...,"FizzBuzz"]
     */
    public static void main(String[] args) {
        ArrayList<String> fizBuzz= fizzBuzzGenerator(1,15);
        System.out.println("fizBuzz = " + fizBuzz);
    }

    private static boolean divisibleBy(int num1,int num2){
                    //6      % 3 =0==0 //true
                   //5 % 2=1==0 //false
        return num1%num2==0;
    }

    private static  ArrayList<String> fizzBuzzGenerator(int first,int end){
        ArrayList<String> result=new ArrayList<>();

        for (int i = first; i <=end ; i++) {
           // if (i%3==0&&i%5==0){
            if (divisibleBy(i,15)) {
                result.add("FizzBuzz");
                // }else if (i%3==0){
            }else if (divisibleBy(i,3)){
                result.add("Fizz");
           // }else if(i%5==0){
            }else if(divisibleBy(i,5)){
                result.add("Buzz");
            }else {
                result.add(i+"");
            }
        }
        return result;
    }

}
