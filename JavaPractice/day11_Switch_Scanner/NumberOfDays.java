package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int n = 34;
        int year = 2000;
        String result = "";


        if (n >= 1 && n <= 12) {

            switch (n) {
                case 2:
                    result = (year % 4 == 0) ? "29 days" : "28 days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 days";
                    break;
                default:
                    result = "31 days";
            }
        } else {
            result = "Invalid";
        }

        System.out.println(result);


    }
}
/*
assume leap year is if year % 4 == 0
 */