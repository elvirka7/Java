package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {


        int day = 10;
        String result = "";

        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid day of the week";
        }
        System.out.println(result);


    }
}
