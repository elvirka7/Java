package day18_NestedLoop;

import java.util.Scanner;

public class ZTheDinner2_RoomReservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variables
        int total = 0, nights;
        String message = "", error = "Invalid entry, please re-enter", bedroom, answer;

        //outer while loop
        while (true) {

            //room type block
            message = "Which bedroom would you like to reserve?";
            System.out.println(message);
            bedroom = sc.nextLine().toLowerCase();
            while (!(bedroom.equals("king") || bedroom.equals("queen") || bedroom.equals("single"))) {
                System.err.println(error);
                System.out.println(message);
                bedroom = sc.nextLine().toLowerCase();
            }
            // amount of nights block
            message = "How many nights are you staying?";
            System.out.println(message);
            nights = sc.nextInt();
            while (!(nights >= 1)) {
                System.err.println(error);
                System.out.println(message);
                nights = sc.nextInt();
            }

            // total for rooms block
            if (bedroom.equals("king")) {
                total += 120 * nights;
            } else if (bedroom.equals("queen")) {
                total += 100 * nights;
            } else if (bedroom.equals("single")) {
                total += 80 * nights;
            }
            sc.nextLine();

            // condition for going out of loop
            message = "Would you like to reserve another room";
            System.out.println(message);
            answer = sc.nextLine().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println(error);
                System.out.println(message);
                answer = sc.nextLine();
            }
            if (answer.equals("no")) {
                break;
            }
        }


        System.out.println("Your total cost  is " + total);
        sc.close();

    }
}




/*
Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */