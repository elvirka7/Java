package day13_String;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {

        int cost = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you have a valid passport? Type yes or no");
        String hasValidPassport = sc.next();
        hasValidPassport = hasValidPassport.toLowerCase();


        if (hasValidPassport.equals("yes")) {
            cost = 1000;

            sc.nextLine();

            System.out.println("Which country are you traveling to?");
            String countryName = sc.nextLine();

            System.out.println("How many bags are you taking with you?");
            byte bag = sc.nextByte();
            cost += bag * 50;

            System.out.println("How many people are you traveling with?");
            short person = sc.nextShort();
            if (person <= 3) {
                cost -= person * 100;
            } else {
                cost -= 300;
            }

            sc.nextLine();

            System.out.println("Please enter the names of people who are traveling with you separated by coma");
            String namesOfPeople = sc.nextLine();

            System.out.println("Your ticket is booked to " + countryName + ". We have charged extra for the " + bag + " bags but you are traveling with " + namesOfPeople + " so we are giving you a discount. Your total cost is $" + cost + ".");



        } else if (hasValidPassport.equals("no")) {

            cost = 1200;

            System.out.println("When did your passport expire, enter number of years");
            int expiredYear = sc.nextInt();
            cost += expiredYear * 75;

            System.out.println("Which country do you plan to travel");
            String country = sc.next();

            System.out.println("Will you be traveling in the next year, enter yes or no");
            String nextYearTravel = sc.next();
            if (nextYearTravel.equals("yes")) {
                cost += 100;
            } else if (nextYearTravel.equals("no")) {
                cost -= 50;
            }

            System.out.println("Looks like your passport has been expired for " + expiredYear + " years, but not to worry we will get it ready for you to travel to " + country + "Your total cost has come out to $" + cost);
        }


    }
}
