package day12_Scanner_LASTVSGITHUB;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int speedLimit = 55;

        System.out.println("Enter current speed");
        int currentSpeed = input.nextInt();
        input.close();

        int speedDifference = currentSpeed - speedLimit;
        if (currentSpeed > 0) {
            if (currentSpeed > speedLimit) {
                System.out.println("You're driving " + speedDifference + " mph over the limit. Slow down!");
            } else {
                System.out.println("Your are not exceeding the speed limit. Good job!");
            }

        } else {
            System.out.println("Please enter a valid speed limit");
        }
    }
}
/*
Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
 */