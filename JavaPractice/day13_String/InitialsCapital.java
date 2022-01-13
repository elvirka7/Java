package day13_String;

import java.util.Scanner;

public class InitialsCapital {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next().toUpperCase();

        System.out.println("Enter your last name");
        String lastName = scan.next().toUpperCase();

        char firstNameInitial = firstName.charAt(0);
        char lastNameInitial = lastName.charAt(0);
        System.out.println(firstNameInitial+"."+lastNameInitial);

        scan.close();
    }
}
/*
write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */