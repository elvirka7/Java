package day14_String;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email address");
        String email = sc.next(), firstName, lastName, domain, result;
        sc.close();

        int underScore = email.indexOf('_'),
                at = email.indexOf('@'),
                dot = email.indexOf('.');

        firstName = email.substring(0, underScore);
        firstName = firstName.replaceFirst(firstName.substring(0, 1), firstName.substring(0, 1).toUpperCase());

        lastName = email.substring(underScore + 1, at);
        lastName = lastName.replaceFirst(lastName.substring(0, 1), lastName.substring(0, 1).toUpperCase());

        domain = email.substring(at + 1, dot);
        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nDomain: " + domain);

    }
}
/*
Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple

 */