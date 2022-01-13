package _2_Statements;

import java.util.Scanner;

public class _5_OddOrEven {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        //WRITE YOUR CODES HERE:

        String result = (number % 2 == 0) ? number + " is even" : number + " is odd";

        System.out.println(result);

        input.close();
    }
}
/*
Using conditional statements, check if number is odd or even. Please follow the below examples and print message accordingly:

Enter a number:
10

10 is even
Enter a number:
10

10 is even
Enter a number:
33

33 is odd
Enter a number:
33

33 is odd
Enter a number:
0

0 is even
 */
