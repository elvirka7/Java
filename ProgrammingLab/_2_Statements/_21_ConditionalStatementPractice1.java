package _2_Statements;

import java.util.Scanner;

public class _21_ConditionalStatementPractice1 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();

        if(name.equals("Chen")){
            System.out.println("teacher");
        } else {
            System.out.println("student");
        }


    }
}
/*
The variable name holds a String user input

Write a conditional statement that will determine if the person is a student or teacher.

If name is equal to "Chen", print "teacher"
For any other input, print "student"
Examples:

input: Chen
output: teacher
input: Chen
output: teacher
input: Faa
output: student
 */