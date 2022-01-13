package _6_MethodsTODO;

import java.util.Scanner;

public class _11_MethodsWithArrays_HameltLogic {
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        // your code here

        boolean hamlet = false;
        if(toBe == true || notToBe == true){
            hamlet = true;

        }
            return hamlet;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }
}
/*
The famous quote is "to be or not to be" is a classic example of boolean logic.

the hamletQuote method only returns true if one or both of the boolean parameters is true.

Examples:

hamletQuote(true, false)
​
returns true
hamletQuote(true, false)

returns true
hamletQuote(false,true)
​
returns true
hamletQuote(false,true)

returns true
hamletQuote(true,true)
​
returns true
hamletQuote(true,true)

returns true
hamletQuote(false,false)
​
returns false
hamletQuote(false,false)

returns false
hint: use the truth table for this one, this can be done with one if and a logical operator.
 */