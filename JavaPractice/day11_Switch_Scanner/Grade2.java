package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char grade = ' ';
        String result = "";

        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
            default:
                result = "Invalid";

        }
        System.out.println(result);


    }
}
/*
 a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
 */