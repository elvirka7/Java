package day14_String;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email address");
        String email = sc.next();
        sc.close();

        int underScore = email.indexOf('_');
       /* int at = email.indexOf('@');
        String lastName = email.substring(underScore + 1, at);
        String domainDotCom = email.substring(at + 1);

        if (email.contains("_")) {

            String firstName = email.substring(0, underScore);

            System.out.println(lastName + "_" + firstName + "@" + domainDotCom);
        } else {
            System.out.println(email);
        }
*/
        System.out.println(underScore);

    }
}

/*
Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */