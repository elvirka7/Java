package _5_Arrays;

import java.util.Scanner;

public class _14_SplitEmail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below

        int countAt = 0;

        for (int i = 0; i < email.length() - 1; i++) {            //Counting how many @ in the string
            if (email.substring(i, i + 1).equals("@")) {
                countAt++;
            }
        }


        String[] email1 = email.split("@");                 //Splitting email string into array


        if (!(countAt == 0 || countAt > 1)) {                     //condition
            System.out.println("Email id: " + email1[0]);
            System.out.println("Email domain: " + email1[1]);

        } else {
            System.out.println("invalid email");
        }
        input.close();

    }
}
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
email -> info@cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

Output:
invalid email

email -> my@fancy@email.com

Output:
invalid email
 */