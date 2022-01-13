package day17_While_DoWhileCHECK;

import java.util.Scanner;

public class ZTheDinner5_RoomReservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wish to reserve a room? yes or no");
        String answer = sc.nextLine().toLowerCase();
        String room = "";
        int price = 0;


        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry, please re-enter your answer");
            answer = sc.nextLine();
        }
        if (answer.equals("no")) {
            System.out.println("Have a nice day");
        } else if (answer.equals("yes")) {
            System.out.println("Which type of room you wish to reserve?");
            room = sc.nextLine().toLowerCase();

            while (!(room.equals("king bed") || room.equals("queen bed") || room.equals("single bed"))) {
                System.err.println("Invalid entry, please select a room (king bed, queen bed, single bed");
                room = sc.nextLine().toLowerCase();
            }
            if (room.equals("king bed")) {
                price = 120;
            } else if (room.equals("queen bed")) {
                price = 100;
            } else if (room.equals("single bed")) {
                price = 80;
            }

        }
        System.out.println("You reserved room with a " + room + ", your total price is: " + "$" + price);
        sc.close();
    }
}
/*
 Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */