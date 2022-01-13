package day11_Switch_Scanner;

public class Elevator_ifAndSwitch {
    public static void main(String[] args) {

        int floorNum = 3;
        String result = "";

        if (floorNum >= 1 && floorNum <= 3) {
            switch (floorNum) {
                case 1:
                    result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }

        } else {
            result = "Invalid floor " + floorNum;
        }
        System.out.println(result);

    }
}
/*
Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"
 */