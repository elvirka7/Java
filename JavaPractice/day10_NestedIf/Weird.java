package day10_NestedIf;

public class Weird {
    public static void main(String[] args) {

        int number = 33;
        boolean isOdd = number % 3 == 0;
        boolean isEven = number % 2 == 0;
        String message = "";

        if (number > 0) {
            if (isEven) {
                if (number > 20) {
                    message = "Not Weird";
                } else if (number >= 6) {
                    message = "Weird";
                } else if (number >= 2) {
                    message = "Not Weird";
                }
            } else {
                message = "Weird";
            }
        } else {
            message = "Please enter a positive number";
        }
        System.out.println(message);

    }
}
/*
Task
Given an integer, N , perform the following conditional actions:

If N is odd, print Weird
If N is even and in the inclusive range of 2 to 5, print Not Weird  DONE
If N is even and in the inclusive range of 6 to 20, print Weird DONE
If N is even and greater than 20, print Not Weird   DONE
Complete the stub code provided in your editor to print whether or not  is weird.


Input Format
A single line containing a positive integer, .

Output Format
Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input - 3
Sample Output - Weird

Sample Input - 24
Sample Output - Not Weird (edited)

 */