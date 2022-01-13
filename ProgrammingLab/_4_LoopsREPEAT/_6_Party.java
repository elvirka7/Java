package _4_LoopsREPEAT;

import java.util.Scanner;

public class _6_Party {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // your code
        // ----------Scanner--------------------------
        System.out.println("Please enter guest name:");
        String name = input.next();

        System.out.println("Do you want to enter new guest name:");
        String answer = input.next();


        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Please enter guest name:");
            name += ", " + input.next();
            System.out.println("Do you want to enter new guest name:");
            answer = input.next();


            if (answer.equalsIgnoreCase("no")) {
                break;
            }

        }

        System.out.println("Guest's list: " + name);
        input.close();
    }
}

/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */