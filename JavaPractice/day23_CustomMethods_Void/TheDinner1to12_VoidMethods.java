package day23_CustomMethods_Void;

import java.util.Arrays;

public class TheDinner1to12_VoidMethods {
    public static void main(String[] args) {

        oddNumbers1to100();
        evenNumbers1to100();
        eligibleToBuyAlcohol(true, 34);
        eligibleToVote("usa", 24);
        gradeOfStudent(99);
        areaOfCircle(7);
        areaOfSquare(2);
        dollarToEuro(1);
        dollarToLira(10);
        kgToLb(10);
        posNegZero(0);
        printEachChar("Alia");
        int[] numbers = {1, 2, 3, 4, 5, 6};
        printEachElement(numbers);
        calculator(9, 9, '*');
        fullName("cYdEo", "SCHOOL");
        anagram("silent", "listen");

    }

    public static void oddNumbers1to100() {
        String result = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                result += i + " ";
            }
        }
        System.out.println("Odd numbers from 1 to 100: " + result);
    }
    public static void evenNumbers1to100() {
        String result = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                result = +i + " ";
            }
        }
        System.out.println("Even numbers from 1 to 100: " + result);
    }
    public static void eligibleToBuyAlcohol(boolean hasID, int age) {

        String result = "";
        if (hasID) {
            if (age >= 21) {
                result = "Yes, eligible to buy alcohol";
            } else {
                result = "No, not eligible to buy alcohol, person needs to be 21 or older";
            }
        } else {
            result = "Not eligible to buy alcohol without an ID";
        }
        System.out.println("Eligibility to buy alcohol: " + result);
    }
    public static void eligibleToVote(String citizen, int age) {
        String result = "";
        if (age >= 21 && citizen.equalsIgnoreCase("USA")) {
            result = "Eligible to vote";
        } else {
            result = "Ineligible to vote";
        }
        System.out.println("Eligibility to vote: " + result);
    }
    public static void gradeOfStudent(int score) {
        String message = "";

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                message = "Excellent";
            } else if (score >= 80) {
                message = "Great";
            } else if (score >= 70) {
                message = "Good";
            } else if (score >= 60) {
                message = "Passed";
            } else {
                message = "Failed";
            }
            System.out.println("Grade is: " + message);

        } else {
            System.out.println("Invalid score");
        }

    }
    public static void areaOfCircle(int radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of a circle: " + area);

    }
    public static void areaOfSquare(int side) {
        System.out.println("Area of a square is :" + side * side);

    }
    public static void dollarToEuro(int dollar) {
        double euros = dollar * .88;
        System.out.println(dollar + " dollar(s) is " + euros + " euros");
    }
    public static void dollarToLira(int dollar) {
        double liras = dollar * 13.88;
        System.out.println(dollar + " dollar(s) is " + liras + " liras");
    }
    public static void kgToLb(int kg) {
        double lbs = kg * 2.2;
        System.out.println(kg + " kg(s) is " + lbs + " lbs");
    }
    public static void posNegZero(int number) {
        String result = (number > 0) ? number + " is a positive number" : (number < 0) ? number + " is a negative number" : number + " is zero";
        System.out.println(result);

    }
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void printEachElement(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public static void calculator(int n1, int n2, char mathOperator) {

        boolean valid = mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/';
        if (valid) { // mathOperator: +, -, *, /
            switch (mathOperator) {
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1 / n2);
            }
        } else {
            System.err.println("Invalid mathOperator: " + mathOperator);
        }
    }
    public static void fullName(String firstName, String lastName) {
        String result = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() + " " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(result);
    }
    public static void anagram(String str1, String str2) {
        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);
        if (Arrays.equals(first, second)) {
            System.out.println(str1 + " and " + str2 + " are anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
    }

}

/*
Tasks:
	1. create a method that can print odd numbers between 1~100 in a same line saperated by space

	2. create a method that can print even numbers between 1~100 in a same line saperated by space

	3. create a method that can check if a person is eligible to buy alcohol

	4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!


	5. create a method that can calculate the grade of the student based on the score

	6. create a method that can calculate the area of a circle

	7. create a method that can calculate the area of a square

	9. create a method that can convert dollar to euro

	10. create a method that can can convert dollar to lira

	11. create a method that can convert kg to lb

	12. create a method that can if the given integer is positive, negative or zero

	13. create a method named printEachChar that can print each characters of a string

	14. create a method named printEachElement that can print each elements of an integer array

	15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result


	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"


    17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */


