package day17_While_DoWhileCHECK;

import java.util.Scanner;

public class ZTheDinner6_InsuranceQuoteCHECK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        String name, gender, married, coverage, accidents, device, error = "Invalid entry. Please re-enter", message = "";
        int price = 0, age, miles;
        double discount = 0;

        //Name block
        message = "Enter your name";
        System.out.println(message);
        name = sc.nextLine();

        //Gender block
        message = "Enter your gender, female or male";
        System.out.println(message);
        gender = sc.nextLine().toLowerCase();
        while (!(gender.equals("female") || gender.equals("male"))) {
            System.err.println(error);
            System.out.println(message);
            gender = sc.nextLine().toLowerCase();
        }


        //Age block
        message = "Enter your age";
        System.out.println(message);
        age = sc.nextInt();
        while (!(age > 0 && age <= 120)) {
            System.err.println(error);
            System.out.println(message);
            age = sc.nextInt();
        }

        sc.nextLine();

        //Marriage status block
        message = "Are you married, yes or no";
        System.out.println(message);
        married = sc.nextLine().toLowerCase();
        while (!(married.equals("yes") || married.equals("no"))) {
            System.err.println(error);
            System.out.println(message);
            married = sc.nextLine().toLowerCase();
        }


        //Mileage block
        message = "How many miles do you drive a day?";
        System.out.println(message);
        miles = sc.nextInt();
        while (!(miles >= 5)) {
            System.err.println(error);
            System.out.println(message);
            miles = sc.nextInt();
        }


        sc.nextLine();

        //Coverage block: full/liability
        message = "Do you want full coverage or liability coverage, answer full or liability";
        System.out.println(message);
        coverage = sc.nextLine().toLowerCase();
        while (!(coverage.equals("full") || coverage.equals("liability"))) {
            System.err.println(error);
            System.out.println(message);
            coverage = sc.nextLine().toLowerCase();
        }

        //Accidents-claims block
        message = "Did you have accidents or claims in the past 5 years, yes or no";
        System.out.println(message);
        accidents = sc.nextLine().toLowerCase();
        while (!(accidents.equals("yes") || accidents.equals("no"))) {
            System.err.println(error);
            System.out.println(message);
            accidents = sc.nextLine().toLowerCase();
        }

        //Anti-theft device block
        message = "Does your car have an anti-theft device, yes or no";
        System.out.println(message);
        device = sc.nextLine().toLowerCase();
        while (!(device.equals("yes") || device.equals("no"))) {
            System.err.println(error);
            System.out.println(message);
            device = sc.nextLine().toLowerCase();
        }


        if (coverage.equals("liability")) {
            price = (age < 25) ? 90 : 50;
            price += (miles <= 10) ? 10 : (miles > 10 && miles <= 50) ? 30 : 50;

        } else if (coverage.equals("full")) {
            price = (age < 25) ? 160 : 120;
            price += (miles <= 10) ? 20 : (miles > 10 && miles <= 50) ? 40 : 70;
        }

        discount = 0;
        if (device.equals("yes")) {
            discount += .05;
        } else if (accidents.equals("yes")) {
            discount += -0.15;
        } else if (accidents.equals("no")) {
            discount += 0.10;
        } else if (married.equals("yes")) {
            discount += 0.05;
        }


        System.out.println(price + (price * discount));
        sc.close();
    }
}
/*
Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount

 */
