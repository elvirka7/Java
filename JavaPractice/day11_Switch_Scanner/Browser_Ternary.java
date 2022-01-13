package day11_Switch_Scanner;

public class Browser_Ternary {
    public static void main(String[] args) {
        String browser = "firefox";
        boolean validBrowser = (browser == "chrome" || browser == "firefox" || browser == "opera" || browser == "safari" || browser == "edge");

        String result = (validBrowser)?
                (browser == "chrome") ? "Chrome browser is selected"
                        : (browser == "firefox") ? "Firefox browser is selected"
                        : (browser == "opera") ? "Opera browser is selected"
                        : (browser == "safari") ? "Safari browser is selected"
                        : "Edge browser is selected"
                : "Invalid browser name";

        System.out.println(result);

    }
}
/*
Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */