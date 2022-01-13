package day12_Scanner_LASTVSGITHUB;

import java.util.Scanner;

public class NumberOfCohabitants {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of people you live with");
        int n = input.nextInt();
        input.close();

        String result;
        if (n > 0) {
            if (n < 3) {
                result = "Lives with less than 3 people";
            } else if (n <= 6) {
                result = "Lives with 3-6 people";
            } else {
                result = "Lives with more than 6 people";
            }
        } else {
            result = "Invalid number of people";
        }

        System.out.println(result);

    }
}
/*
Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */