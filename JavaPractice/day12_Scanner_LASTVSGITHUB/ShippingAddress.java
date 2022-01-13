package day12_Scanner_LASTVSGITHUB;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = sc.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = sc.next();

        sc.nextLine();

        System.out.println("Enter your street name");
        String streetName = sc.nextLine();

        System.out.println("Enter your city name");
        String cityName = sc.nextLine();

        System.out.println("Enter your state");
        String stateName = sc.next();

        System.out.println("Enter your zip code");
        String zipcode = sc.next();

        sc.close();

        String result = fullName + "\n" + buildingNumber + " " + streetName + "\n" + cityName + ", " + stateName + " " + zipcode;
        System.out.println(result);

    }
}
/*
Print shipping address using Scanner
 */