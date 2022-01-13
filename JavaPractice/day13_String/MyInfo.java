package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your gender");
        String gender = sc.next();

        sc.nextLine();

        System.out.println("Enter your full name");
        String fullName = sc.nextLine();

        System.out.println("Enter your phone number");
        long phoneNumber = sc.nextLong();

        System.out.println("Enter your zip code");
        int zipCode = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your school name");
        String schoolName = sc.nextLine();

        System.out.println("Enter your city name");
        String cityName = sc.nextLine();

        System.out.println("Enter your state name");
        String stateName = sc.next();

        System.out.println("Enter your building number");
        int buildingNumber = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your street name");
        String streetName = sc.nextLine();

        String result = "1. Full name: " + fullName + "\n2. Age: " + age + "\n3. Gender: " + gender + "\n4. Phone number: " + phoneNumber + "\n5. Address: \n\t\t" + buildingNumber + " " + streetName + "\n\t\t" + cityName + ", " + stateName + " " + zipCode + "\n6. School name: " + schoolName;


        System.out.println(result);

        sc.close();
    }
}
/*
Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in separate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name
 */