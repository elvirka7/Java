package _2_Statements;

import java.util.Scanner;

public class _18_AndroidVersions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();
        input.close();

        String result = (version == 1.5) ? "Cupcake" : (version == 1.6) ? "Donut" : (version == 2.1) ? "Eclair" : (version == 2.2) ? "Froyo" : (version == 2.3) ? "Gingerbread"
                : (version == 3.1) ? "Honeycomb" : (version == 4.0) ? "Ice Cream Sandwich" : (version == 4.1) ? "Jelly Bean" : (version == 4.4) ? "KitKat"
                : (version == 5.0) ? "Lollipop" : (version == 8.0) ? "Oreo" : (version == 9.0) ? "Pie" : "Sorry, I don't know this version!";

        System.out.println(result);


    }
}
/*
Android is one of the best operating systems in the world that helps the billion of users who use smart phones and tablets. Also, Android versions always had some funny names related to sweets. In this assignment, you need to write a program that will print a name of Android version, based on number. Please refer to the link beneath, in order to develop your if statement. https://www.javatpoint.com/android-versions

1. Create an object of Scanner class named scanner. (DONE)
2. Create double variable named version. (DONE)
3. Write an if statement that will print android version name based on value of the version variable.

Versions 1.5 - Cupcake 1.6 - Donut 2.1 - Eclair 2.2 - Froyo 2.3 - Gingerbread 3.1 - Honeycomb 4.0 - Ice Cream Sandwich 4.1 - Jelly Bean 4.4 - KitKat 5.0 - Lollipop 8.0 - Oreo 9.0 - Pie

Example:

input: 1.5
output: Cupcake
input: 1.5
output: Cupcake
input: 9.0
output: Pie
input: 9.0
output: Pie
input: 11.0
output: Sorry, I don't know this version!
 */