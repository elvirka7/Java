package day15_ForLoop;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {

        String website = new Scanner(System.in).next();
boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov");

        if (website.startsWith("www.") && validEnd) {
            System.out.println("Valid website address");
        } else {
            System.out.println("Not valid website address");
        }



    }
}
