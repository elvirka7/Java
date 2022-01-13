package day10_NestedIf;

public class OxygenTank {
    public static void main(String[] args) {

        int level = 50;
        String message = "";

        if (level > 0 && level <= 100) {

            if (level > 90) {
                message = "Oxygen level: " + level + "% - Your tank is full";
            } else if (level > 80) {
                message = "Oxygen level: " + level + "% - Still okay";
            } else if (level > 70) {
                message = "Oxygen level: " + level + "% - Don't go too far";
            } else if (level > 60) {
                message = "Oxygen level: " + level + "% - Start to head back";
            } else if (level > 50) {
                message = "Oxygen level: " + level + "% - Be careful, now you are at 50%";
            } else {
                message = "Oxygen level: " + level + "% - Your tank is very low";
            }

        } else {
            message = "Your oxygen tank is not working";
        }
        System.out.println(message);
    }
}
/*
Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at 50%

                USE ONE PRINT STATEMENT ONLY
 */