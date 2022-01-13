package _3_String;

import java.util.Locale;
import java.util.Scanner;

public class _21_Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODES HERE:

        String firstName = email.substring(0, 1).toUpperCase() + email.substring(1, email.indexOf('_')),
                lastName = email.substring(email.indexOf('_') + 1, email.indexOf('_') + 2).toUpperCase() + email.substring(email.indexOf('_') + 2, email.indexOf('@')),
                domain = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nDomain: " + domain);

        scan.close();
    }
}
/*
Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

Input: craig_federighi@apple.com

Output:
First name: Craig
Last name: Federighi
Domain: apple
 */
