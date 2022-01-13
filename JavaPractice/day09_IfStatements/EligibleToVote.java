package day09_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        int age = 23;
        String citizen = "USA";

        if (age >= 21 && citizen.equals("USA")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Ineligible to vote");
        }

    }
}

/*
Write a program that can check if the person is eligible to vote
 */