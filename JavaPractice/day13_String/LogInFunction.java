package day13_String;

import java.util.Scanner;

public class LogInFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = sc.next();

        System.out.println("Enter your password");
        String password = sc.next();

        String result = "";

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        } else {
            System.err.println("Incorrect username or password");
        }

        sc.close();

    }
}
/*
You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon
 */