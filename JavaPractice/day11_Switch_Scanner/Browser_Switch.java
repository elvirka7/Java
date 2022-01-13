package day11_Switch_Scanner;

public class Browser_Switch {
    public static void main(String[] args) {

        String browserName = "Chrome",
                result = "";

        switch (browserName) {
            case "Chrome":
                result = browserName+" browser is opening";
                break;

            case "Firefox":
                result = browserName+" browser is opening";
                break;
            case "Opera":
                result = browserName+" browser is opening";
                break;
            case "Safari":
                result = browserName+" browser is opening";
                break;
            case "Edge":
                result = browserName+" browser is opening";
                break;
            default: result = "Invalid Browser";

        }
        System.out.println(result);
    }
}
/*
write a program that can display the selected browser
            3.1  declear a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */