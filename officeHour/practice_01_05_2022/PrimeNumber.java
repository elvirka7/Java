package practice_01_05_2022;

public class PrimeNumber {

    /*  (PrimeNumber)

                     Task 1 :   Write a method that can check if a number is prime or not
				       Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1

                                   10                              10 / 1-2-5-10         it is not Prime
                                    7                              7  / 1-7             PrimeNumber
                                   13                             13/  1-13             PrimeNumber
                                    9                              9 /  1-3-9           it is not Prime


                     */

    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int number){

        if(number<2){
            return false;
        }

        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }

        return true;
    }
}
