package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browser = "";
        String result = "";
        boolean validBrowser = browser == "chrome" || browser == "firefox" ||
                browser == "opera" || browser == "safari" || browser == "edge";

        if(validBrowser){
            if (browser == "chrome") {
                result = "Chrome browser is selected";
            } else if (browser == "firefox") {
                result = "Firefox browser is selected";
            } else if (browser == "opera") {
                result = "Opera browser is selected";
            } else if (browser == "safari") {
                result = "Safari browser is selected";
            } else {
                result = "Edge browser is selected";
            }
        } else {
            result = "Invalid browser name";
        }
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