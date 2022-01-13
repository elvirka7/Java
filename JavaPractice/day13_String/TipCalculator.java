package day13_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String result = "";

        System.out.println("Split or No split (Yes or No)?");
        String split = sc.next().toUpperCase();

        System.out.println("Enter the number of people");
        int numberOfPeople = sc.nextInt();

        System.out.println("Enter the check amount:");
        double checkAmount = sc.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = sc.next().toLowerCase();


        double tip = (serviceQuality.equals("poor")) ? 0.05 : (serviceQuality.equals("fair")) ? 0.10
                : (serviceQuality.equals("good")) ? 0.15 : (serviceQuality.equals("great")) ? 0.20
                : (serviceQuality.equals("excellent")) ? 0.25 : 0;

        double totalTip = checkAmount * tip;

        if (split.equals("YES")) {
            double totalPerPerson = checkAmount / numberOfPeople;
            double tipPerPerson = totalTip / numberOfPeople;
            result = "Number of people entered: " + numberOfPeople + "\nTotal to pay: " + checkAmount + "\nTotal tip: " + totalTip + "\nTotal per person: " + totalPerPerson + "\nTip per person: " + tipPerPerson;
        }

        System.out.println(result);

        sc.close();
    }
}
/*
Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output)
	Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method

 */