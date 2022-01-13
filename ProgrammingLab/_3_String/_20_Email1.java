package _3_String;

import java.util.Scanner;

public class _20_Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        // WRITE YOUR CODES HERE:

        String result = "";

        if (email.contains("_")) {

            String firstName = email.substring(0, email.indexOf('_')),
                    lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@')),
                    domainDotCom = email.substring(email.indexOf('@'));

            System.out.println(lastName + "_" + firstName + domainDotCom);
        } else {
            System.out.println(email);
        }

        scan.close();
    }
}
/*
Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

input: barakobama@gmail.com
output: barakobama@gmail.com
 */