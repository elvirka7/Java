package utilities;

public class MathUtility {

    //RETURNS THE SUM OF TWO NUMBERS
    public static int sum(int num1, int num2){
        return num1+num2;
    }
    public static double sum(double num1, double num2){
        return num1+num2;
    }
    
    //RETURNS THE SUBTRACTION OF TWO NUMBERS
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }
    
    //RETURNS MULTIPLICATION OF TWO NUMBERS
    public static double multiplication(double num1, double num2){
        return num1*num2;
    }
    
    //RETURNS DIVISION RESULT OF TWO NUMBERS
    public static int division(int num1, int num2){
        return num1/num2;
    }
    public static double division(double num1, double num2){
        return num1/num2;
    }

    //CHECKS IF THE NUMBER IS EVEN, RETURNS BOOLEAN
    public static boolean isEven(int number){
       boolean isEven = false;
        if(number%2==0){
            isEven = true;
        }
        return isEven;
    }

    //CHECKS IF THE NUMBER IS ODD, RETURNS BOOLEAN
    public static boolean isOdd(int number){
        boolean isOdd = false;
        if(number%2!=0){
            isOdd = true;
        }
        return isOdd;
    }

    //RETURNS MAXIMUM NUMBER BETWEEN TWO NUMBERS
    public static int max(int num1, int num2){

     if(num1>num2){
         return num1;
     } else if(num2>num1){
         return num2;
     } else {
         return num1;
     }
    }
    public static double max(double num1, double num2){

        if(num1>num2){
            return num1;
        } else if(num2>num1){
            return num2;
        } else {
            return num1;
        }
    }

    //RETURNS MINIMUM NUMBER BETWEEN TWO NUMBERS
    public static int min(int num1, int num2){

        if(num1<num2){
            return num1;
        } else if(num2<num1){
            return num2;
        } else {
            return num1;
        }
    }
    public static double min(double num1, double num2){

        if(num1<num2){
            return num1;
        } else if(num2<num1){
            return num2;
        } else {
            return num1;
        }
    }
    
    //RETURNS THE SQUARE OF A NUMBER
    public static int square(int number){
        return number*number;
    }
    public static double square(double number){
        return number*number;
    }
    
    //RETURNS THE CUBE OF A NUMBER
    public static int cube(int number){
        return number*number*number;
    }
    public static double cube(double number){
        return number*number*number;
    }
}
