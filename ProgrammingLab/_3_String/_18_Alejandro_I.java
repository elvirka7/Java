package _3_String;

import java.util.Locale;
import java.util.Scanner;

public class _18_Alejandro_I {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //Write your code here:
        String result = "";

        if (a.toLowerCase().contains("alejnadro")) {
            result = "read";
        } else {
            result = "don't read";
        }
        System.out.println(result);
        s.close();
    }
}
/*
Alejandro has many emails and only has time to read the emails that refer to him.
Check if his name is found in the email and if it does print "read", but if his name is not in the email print "don't read"

Examples:

a = "dear alejandro.....alot of text"
output: "read"

a = "thunder blaz is the best drink in the galaxy..."
output: "don't read"

a = "subject : important project, alejandro we refer to you  this ...."
output: "read"
 */