package _1_Variables;

import java.util.Scanner;

public class _7_SchoolGrades {
    public static void main(String[] args) {
        // Enter your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Grader!\nPlease enter subject name number 1 and score for this subject");
        String subject1 = input.next();
        double grade1 = input.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = input.next();
        double grade2 = input.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = input.next();
        double grade3 = input.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = input.next();
        double grade4 = input.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = input.next();
        double grade5 = input.nextDouble();


        double averageScore = (grade1+grade2+grade3+grade4+grade5)/5;
        String result = "Summary: "+subject1+" - "+grade1+", "+subject2+" - "+grade2+", "+subject3+" - "+grade3+", "+subject4+" - "+grade4+", "+subject5+" - "+grade5+"\nYour average score is: "+averageScore+"\nThank you for using Grader!\nGoodbye!";

input.close();
    }
}
/*
Write the program that will calculate the average grade. Use 5 String variables and 6 double variables to hold the subject and the grade value. Build a summary with all the information by concatenating the subjects and grades. Then calculate the average grade and print display the average score too.

Execution flow with example:

Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Math
5.0
Please enter subject name number 2 and score for this subject
Biology
4.2
Please enter subject name number 3 and score for this subject
English
4.4
Please enter subject name number 4 and score for this subject
Chemistry
4.8
Please enter subject name number 5 and score for this subject
Music
3.4

Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
Your average score is: 4.36
Thank you for using Grader!
Goodbye!
 */